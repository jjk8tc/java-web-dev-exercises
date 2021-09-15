package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;

public class CreateMenu {

    public static void main(String[] args){
        Menu myMenu= new Menu();

        MenuItem pizza = new MenuItem("Best Pizza",5.00, "Its da best pizza","junk", false,500);
        MenuItem burger = new MenuItem("Hamburger",5.00, "Its da best burger","junk", false,800);

        ArrayList<MenuItem> menuItems= new ArrayList<>(pizza, burger);
        myMenu.setCurrentMenu(menuItems);

        System.out.println(myMenu.getLastUpdated());
        Menu myMenu= new Menu();

    }
}
