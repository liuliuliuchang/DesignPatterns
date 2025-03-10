package FactoryDemo.Fruit;

import FactoryDemo.pro.Apple;
import FactoryDemo.pro.Banana;
import FactoryDemo.pro.MyFruit;
import FactoryDemo.pro.MyFruitStore;

public class ClientClass {
    public static void main(String[] args) {
        MyFruit fru1 = new Apple();
        MyFruit fru2 = new Banana();
        MyFruitStore mfs1 = MyFruitStore.Getfruitstore();
        MyFruitStore.Add(1,fru1);
        MyFruitStore.Add(2,fru2);
        MyFruitStore.Add(3, new Apple());
        MyFruitStore.Add(4, new Banana());
        MyFruitStore mfs2 = MyFruitStore.Getfruitstore();

        MyFruit fru = (MyFruit)mfs1.Get(4);
        fru.Display();
        System.out.println("msf1::" + mfs1.toString());
        System.out.println("msf2::" + mfs2.toString());
        /*
        MyFruit fru2 = (Apple)fru1.clone();
        fru1.Display();
        fru2.Display();
        System.out.println("fru1:" + fru1.hashCode());
        System.out.println("fru2:" + fru2.hashCode());
        System.out.println("fru1:" + fru1.toString());
        System.out.println("fru2:" + fru2.toString());
        System.out.println(fru1.equals(fru2));
        */
        /*
        //Factory factory= new AFactory();
        Factory factory = (Factory)XMLUtil.getBean();
        Fruit fruit = factory.CreateFruit();
        //Fruit fruit = factory.CreateFruit("A");
        fruit.eat();

         */
    }

    public String factory(String fruitname) {
        /*if (fruitname.equals("Apple"))
            return "Apple";
        if (fruitname.equals("Banana"))
            return "Banana";
            */
        return null;
    }
}
