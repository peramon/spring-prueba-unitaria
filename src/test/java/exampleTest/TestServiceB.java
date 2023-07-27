package exampleTest;

import com.ejemplo.exampletest.services.IServiceA;
import com.ejemplo.exampletest.services.IServiceB;
import com.ejemplo.exampletest.services.impl.ServiceAImpl;
import com.ejemplo.exampletest.services.impl.ServiceBImpl;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class TestServiceB {

    @Test
    public void testMultiply(){
        IServiceB serviceB = new ServiceBImpl();
        assertEquals(serviceB.multiply(2,3),6);
    }

    @Test
    public void testMultiplySum(){
        // The service B depends on service A
        // Service A
        IServiceA serviceA = new ServiceAImpl();
        // Service B
        IServiceB serviceB = new ServiceBImpl();

        serviceB.setServiceA(serviceA);
        assertEquals(serviceB.multiplySum(2,3,3),15);
    }

    @Test
    public void testMultiplySumMockito(){
        // Mockito is a Java Library for simulating objects
        IServiceA serviceA = Mockito.mock(IServiceA.class);
        Mockito.when(serviceA.sum(2,3)).thenReturn(5);
        // Service B
        IServiceB serviceB = new ServiceBImpl();

        serviceB.setServiceA(serviceA);
        assertEquals(serviceB.multiplySum(2,3,3),15);
    }
}
