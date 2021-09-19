package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;

public class CreateMenu {

    public static void main(String[] args){

        MenuItem pizza = new MenuItem("Best Pizza",18.00, "Its da best pizza","junk", false,1300);
        MenuItem burger = new MenuItem("Hamburger",12.00, "Its da best burger","junk", false,800);
        MenuItem iceCream = new MenuItem("I scream", 4.15, "Its cold", "dessert", true, 200);
        System.out.println(pizza.getCalories());
        System.out.println(burger.getDescription());
        System.out.println(iceCream.getIsNew());


        ArrayList<MenuItem> menuItems= new ArrayList<MenuItem>();
        menuItems.add(pizza);
        menuItems.add(burger);


        Menu myMenu= new Menu(menuItems);

        System.out.println(myMenu.getLastUpdated());
        System.out.println(myMenu.getCurrentMenu());

        myMenu.addToMenu(iceCream);
        System.out.println(myMenu.getCurrentMenu());


    }
}
