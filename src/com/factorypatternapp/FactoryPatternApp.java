package com.factorypatternapp;

public class FactoryPatternApp {
    public static void main(String[] args) {
        ItemFactory factory = new ItemFactory();

        // Создаем различные предметы с помощью фабрики
        Item car = factory.createItem(ItemFactory.ItemType.CAR);
        Item furniture = factory.createItem(ItemFactory.ItemType.FURNITURE);
        Item fruit = factory.createItem(ItemFactory.ItemType.FRUIT);
        Item animal = factory.createItem(ItemFactory.ItemType.ANIMAL);

        // Используем созданные объекты
        car.create();
        furniture.create();
        fruit.create();
        animal.create();
    }
}
