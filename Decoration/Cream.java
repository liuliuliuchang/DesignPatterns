package 组合与装饰模式.Decoration;

public class Cream extends Decorating{

    public void PutCream(){
        System.out.println("Add Cream...");
    }

    public Cream(IBirthdayCake birthdayCake) {
        super(birthdayCake);
    }
}
