package com.ejemplo.services.impl;

import com.ejemplo.services.IServiceA;

public class ServiceAImpl implements IServiceA {

    @Override
    public int sum(int a, int b) {
        return a+b;
    }
}
