package FactoryDemo.pro;

import java.util.Hashtable;

public class MyFruitStore {
    private static Hashtable fruittable=null;
    private static MyFruitStore fruitstore = new MyFruitStore();
    private MyFruitStore(){
        fruittable = new Hashtable<Integer,MyFruit>();
    }
    public static MyFruitStore Getfruitstore(){
        if(fruittable == null){
            fruitstore = new MyFruitStore();
        }
        return fruitstore;
    }
    public static void Add(Integer key,MyFruit fruit){
        fruittable.put(key,fruit);
    }
    public static MyFruit Get(Integer key){
        MyFruit fruit = (MyFruit)fruittable.get(key);
        return (MyFruit) fruit.clone();
    }
}
