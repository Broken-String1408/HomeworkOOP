package ru.geekbrains.oop.lesson1;

public class Chips extends Product {
    private String taste;

    private double weight;

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private void processTaste(String taste){
        if(taste == null || taste.isBlank()){
            this.taste = "Salt";
        }
        else {
            this.taste = taste;
        }
    }
    private void processWeight(double weight){
        if(weight < 10){
            this.weight = 50;
        }
        else {
            this.weight = weight;
        }
    }
    public Chips(String brand, String name, double price, String taste, double weight){
        super(brand, name, price);
        processTaste(taste);
        processWeight(weight);
    }
    @Override
    public String displayInfo() {
        return String.format("Пачка чипсов\n\t[Производитель: %s\n\tНаименование: %s\n\tСтоимость: %.2f\n\tВкус: %s\n\tМасса нетто: %.2f]",
                brand, name, price, taste, weight);
    }
}
