package FactoryDemo.Bui;

public class KFCWaiter {
    private MealBuilder mb;

    public void setMealBuilder(MealBuilder mb) {
        this.mb = mb;
    }

    public Meal Construct() {
        mb.buildFood();
        mb.buildDrink();
        return mb.getMeal();
    }
}
