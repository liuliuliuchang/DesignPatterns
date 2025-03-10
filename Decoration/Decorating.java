package 组合与装饰模式.Decoration;

public class Decorating implements IBirthdayCake{
    private IBirthdayCake birthdayCake;

    public Decorating(IBirthdayCake birthdayCake) {
    }

    @Override
    public void Show() {
        birthdayCake.Show();
    }
}
