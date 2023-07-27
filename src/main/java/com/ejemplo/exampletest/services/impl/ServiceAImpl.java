package com.ejemplo.exampletest.services.impl;

import com.ejemplo.exampletest.services.IServiceA;

public class ServiceAImpl implements IServiceA {

    @Override
    public int sum(int a, int b) {
        return a+b+1;
    }
}
