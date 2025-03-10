package 组合与装饰模式.Decoration;

public class Fruit extends Decorating{
    public void PutFruit(){
        System.out.println("Add Fruit...");
    }
    public Fruit(IBirthdayCake birthdayCake){
        super(birthdayCake);
    }
    public void Show(){
        System.out.println("");
    }

}
