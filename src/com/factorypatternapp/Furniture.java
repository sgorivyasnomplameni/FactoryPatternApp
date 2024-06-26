package com.factorypatternapp;

public class Furniture implements Item {
    @Override
    public void create() {
        System.out.println("Furniture created.");
    }
}