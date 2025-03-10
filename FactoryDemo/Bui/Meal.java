package FactoryDemo.Bui;

import FactoryDemo.Abf.*;

public class Meal {
    private String food;
    private String drink;
    private AFruitAndVegetables Ifruit;

    public void setFood(String food){
        this.food = food;
    }

    public void setDrink(String drink){
        this.drink = drink;
    }

    public String getFood(){
        return food;
    }
    public String getDrink(){
        return drink;
    }
}
