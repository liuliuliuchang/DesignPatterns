// 具体子类：制作咖啡
public class Coffee extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Brewing coffee...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk...");
    }

    @Override
    protected boolean customerWantsCondiments() {
        // 假设用户可以选择不加调料
        return false; // 不加调料
    }
}