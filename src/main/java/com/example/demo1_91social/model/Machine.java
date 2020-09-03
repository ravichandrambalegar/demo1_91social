package com.example.demo1_91social.model;

public class Machine {
    private String name;
    private double price;
    private String condition;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Machine(String name, double price, String condition) {
        this.name = name;
        this.price = price;
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Machin{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", condition='" + condition + '\'' +
                '}';
    }
}
