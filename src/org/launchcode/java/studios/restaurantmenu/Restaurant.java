package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;

public class Restaurant {

    public static void main(String[] args) throws InterruptedException {
        Thread t;

        MenuItem pizza = new MenuItem("Best Pizza",18.00, "Its da best pizza","junk", false,1300);
        MenuItem burger = new MenuItem("Hamburger",12.00, "Its da best burger","junk", false,800);
        MenuItem iceCream = new MenuItem("I scream", 4.15, "Its cold", "dessert", true, 200);
        System.out.println(pizza.getCalories());
        System.out.println(burger.getDescription());
        System.out.println(iceCream.getIsNew());

        //Creating an Array List of the MenuItems to eventually add to my menu
        ArrayList<MenuItem> menuItems= new ArrayList<MenuItem>();
        menuItems.add(pizza);
        menuItems.add(burger);

        //Creating an instance of the menu class and passing in the menu items
        Menu myMenu= new Menu(menuItems);

        //confirming I can see when the menu was last updated and seeing the items in the menu
        System.out.println(myMenu.getLastUpdated());
        System.out.println(myMenu.getCurrentMenu());

        //using the instance method to add a new item to the menu
        myMenu.addToMenu(iceCream);

        //confirming the new item was added to the menu and seeing the time of last update was updated
        System.out.println(myMenu.getLastUpdated());
        System.out.println(myMenu.getCurrentMenu());
        Thread.sleep(2000);
        //System.out.println(myMenu.get(0).getName);

        //using the instance method to remove an item from the menu
        myMenu.removeFromMenu(iceCream);

        //confirming the new item was removed from the menu and seeing the time of last update was updated
        System.out.println(myMenu.getLastUpdated());
        System.out.println(myMenu.getCurrentMenu());

        myMenu.printItem(iceCream);
        myMenu.printMenu();

    }
}
