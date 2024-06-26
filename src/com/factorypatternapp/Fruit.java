package com.factorypatternapp;

public class Fruit implements Item {
    @Override
    public void create() {
        System.out.println("Fruit created.");
    }
}