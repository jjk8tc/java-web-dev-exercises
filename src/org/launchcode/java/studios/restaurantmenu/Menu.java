package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> currentMenu = new ArrayList<>();
    private Date lastUpdated;

    public Menu(Date lastUpdated, <MenuItem> currentMenu){
        this.lastUpdated= lastUpdated;
        this.currentMenu=currentMenu;
    }

    //getters
    public ArrayList<MenuItem> getCurrentMenu(){return currentMenu;}
    public Date getLastUpdated(){return lastUpdated;}

    //setters
    public void setCurrentMenu(ArrayList<MenuItem> item){
        this.currentMenu=item;
        this.lastUpdated = new Date(System.currentTimeMillis());
    }

    public void setLastUpdated(Date lastUpdated){
        this.lastUpdated = lastUpdated;
    }

}
