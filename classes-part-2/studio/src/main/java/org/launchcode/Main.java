package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Menu restaurant = new Menu(new Date(2024, 4, 11), new ArrayList<MenuItem>());
        MenuItem hamburger = new MenuItem(9.00, "ground beef", "main", true);
        restaurant.addMenuItem(hamburger);
        System.out.println(restaurant.getItems());
    }
}
