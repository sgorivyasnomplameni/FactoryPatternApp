package com.factorypatternapp;

public class ItemFactory {
    // Используем enum для определения типов предметов
    public enum ItemType {
        CAR, FURNITURE, FRUIT, ANIMAL
    }

    // Метод фабрики для создания объектов Item
    public Item createItem(ItemType type) {
        switch (type) {
            case CAR:
                return new Car();
            case FURNITURE:
                return new Furniture();
            case FRUIT:
                return new Fruit();
            case ANIMAL:
                return new Animal();
            default:
                throw new IllegalArgumentException("Unknown item type.");
        }
    }
}