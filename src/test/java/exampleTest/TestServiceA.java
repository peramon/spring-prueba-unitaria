package exampleTest;

import com.pai.rest.exampletest.services.IServiceA;
import com.pai.rest.exampletest.services.impl.ServiceAImpl;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestServiceA {

    @Test
    public void testSum(){
        int a = 2;
        int b = 2;
        IServiceA serviceA = new ServiceAImpl();
        assertEquals(serviceA.sum(a, b),5);
    }
}
