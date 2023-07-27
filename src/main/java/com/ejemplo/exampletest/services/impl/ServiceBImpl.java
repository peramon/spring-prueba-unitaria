package com.ejemplo.exampletest.services.impl;

import com.ejemplo.exampletest.services.IServiceA;
import com.ejemplo.exampletest.services.IServiceB;

public class ServiceBImpl implements IServiceB {

    private IServiceA serviceA;

    @Override
    public IServiceA getServiceA() {
        return serviceA;
    }

    @Override
    public void setServiceA(IServiceA serviceA) {
        this.serviceA = serviceA;
    }

    @Override
    public int multiplySum(int a, int b, int multiplier) {
        return serviceA.sum(a, b) * multiplier;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
}
