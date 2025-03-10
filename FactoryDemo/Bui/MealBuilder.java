package FactoryDemo.Bui;

public interface MealBuilder {
    void buildFood();
    void buildDrink();
    Meal getMeal();
}
