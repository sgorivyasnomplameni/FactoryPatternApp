package com.factorypatternapp;

public class Car implements Item {
    @Override
    public void create() {
        System.out.println("Car created.");
    }
}