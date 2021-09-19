package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> currentMenu = new ArrayList<>();
    private Date lastUpdated = new Date();

    public Menu(ArrayList<MenuItem> currentMenu){
        //this.lastUpdated = lastUpdated;
        this.currentMenu = currentMenu;
    }


    //getters
    public ArrayList<MenuItem> getCurrentMenu(){return currentMenu;}
    public Date getLastUpdated(){return lastUpdated;}


    public void addToMenu(MenuItem item){
        this.currentMenu.add(item);
        this.lastUpdated = new Date(System.currentTimeMillis());
    }

    public void removeFromMenu(MenuItem removeItem){
        int indexOfRemove=-1;
        for (int i=0;i<this.currentMenu.size(); i++){
            if (currentMenu.get(i).equals(removeItem)){
                indexOfRemove=i;
            }
        }
        this.currentMenu.remove(indexOfRemove);
        this.lastUpdated = new Date(System.currentTimeMillis());
    }

    //public void setLastUpdated(Date lastUpdated){
    //    this.lastUpdated = lastUpdated;
    //}

    public String menuLastUpdated(){
        return ("This menu was last updated on" + this.lastUpdated);
    }

    public void printItem(MenuItem item){
        System.out.println(item.getName());
    }

    public void printMenu(){
        String menuBuild="";
        for (MenuItem item : this.currentMenu){
            menuBuild+= "Name: "+item.getName()+"\n"
                    +"Price: "+item.getPrice()+"\n"
                    +"Description: "+item.getDescription()+"\n"
                    +"Category: "+item.getCategory()+"\n\n";
            //System.out.println(item.getDescription());
        }
        System.out.println(menuBuild);
    }


}
