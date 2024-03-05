package ru.geekbrains.oop.lesson1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }
    public BottleOfWater getBottleOfWater(String name, double volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater)product;
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume)
                    return bottleOfWater;
            }
        }
        return null;
    }
    public Chips getChips(String name, String taste){
        for (Product product: products) {
            if(product instanceof Chips){
                Chips chips = (Chips)product;
                if(chips.getName().equals(name) && chips.getTaste().equals(taste)){
                    return chips;
                }
            }
        }
        return null;
    }


}
