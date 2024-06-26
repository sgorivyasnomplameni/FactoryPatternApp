package com.factorypatternapp;

public class Animal implements Item {
    @Override
    public void create() {
        System.out.println("Animal created.");
    }
}