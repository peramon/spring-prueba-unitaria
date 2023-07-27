package com.pai.rest.exampletest.services.impl;

import com.pai.rest.exampletest.services.IServiceA;

public class ServiceAImpl implements IServiceA {

    @Override
    public int sum(int a, int b) {
        return a+b+1;
    }
}
