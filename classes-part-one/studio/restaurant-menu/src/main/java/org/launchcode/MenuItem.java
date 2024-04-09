package org.launchcode;

public class MenuItem {
    private String name;
    private double price;
    private String category;
    private String description;

    public MenuItem(String name, double price, String category, String description) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    private void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }
}
