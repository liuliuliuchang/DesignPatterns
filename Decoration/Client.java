package 组合与装饰模式.Decoration;

public class Client {
    public static void main(String[] args) {
        IBirthdayCake birthdayCake = new Cake();
        birthdayCake.Show();
        Cream cream = new Cream(birthdayCake);
        cream.PutCream();

        Fruit fruit = new Fruit(cream);
        fruit.PutFruit();
        birthdayCake.Show();

    }
}
