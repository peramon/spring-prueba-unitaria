package com.ejemplo.services;

public interface IServiceB {
    public IServiceA getServiceA();

    public void setServiceA(IServiceA serviceA);

    public int multiplySum(int a, int b, int multiplier);

    public int multiply(int a, int b);
}
