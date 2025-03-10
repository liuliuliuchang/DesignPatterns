package FactoryDemo.Fruit;

public class BFactory extends Factory{

    public Fruit CrreateFruit(){
        return new Banana();
    }
}
