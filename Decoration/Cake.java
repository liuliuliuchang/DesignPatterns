package 组合与装饰模式.Decoration;

public class Cake implements IBirthdayCake{
    public Cake(){
        System.out.println("Cake Blank was created");
    }
    public void Show(){
        System.out.println("Cake Blank");
    }
}
