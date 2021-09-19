package org.launchcode.java.studios.restaurantmenu;

import java.util.Date;

public class MenuItem {
    private String name;
    private Double price;
    private String description;
    private String category;
    //private Date dateAdded;
    private boolean isNew;
    private int calories;

    public MenuItem(String name, Double price, String description, String category, boolean isNew, int calories){
        this.name=name;
        this.price=price;
        this.description=description;
        this.category=category;
        //this.dateAdded=dateAdded;
        this.isNew=isNew;
        this.calories=calories;
    }

    //getters
    public String getName(){return name;}
    public Double getPrice(){return price;}
    public String getDescription(){return description;}
    public String getCategory(){return category;}
    //public Date getDateAdded(){return dateAdded;}
    public boolean getIsNew(){return isNew;}
    public int getCalories(){return calories;}

    //setters
    public void setName(String aName){
        this.name=aName;
    }
    public void setPrice(Double aPrice){
        this.price=aPrice;
    }
    public void setDescription(String aDescription){
        this.description=aDescription;
    }
    public void setCategory(String aCategory){
        this.category=aCategory;
    }
    //public void setDateAdded(){
    //    this.dateAdded= new Date();
    //}

    public void setIsNew(boolean aIsNew){
        this.isNew=aIsNew;
    }

    public void setCalories(int aCalories){
        this.calories=aCalories;
    }


    public String isItemNew(){
        String info = "";
        if(this.isNew){
            info = "This item is new";
        } else{
            info = "This item is not new";
        }

        return info;
    }



}
