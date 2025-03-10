// 抽象类定义模板方法和基本步骤
public abstract class Beverage {
    // 模板方法，定义制作饮料的整体流程
    public final void prepareBeverage() {
        boilWater();          // 公共步骤：烧水
        brew();               // 抽象步骤：冲泡（子类实现）
        pourInCup();          // 公共步骤：倒入杯中
        if (customerWantsCondiments()) { // 钩子方法：是否添加调料
            addCondiments();  // 抽象步骤：添加调料（子类实现）
        }
    }

    // 公共方法：烧水
    private void boilWater() {
        System.out.println("Boiling water...");
    }

    // 公共方法：倒入杯中
    private void pourInCup() {
        System.out.println("Pouring into cup...");
    }

    // 抽象方法：冲泡（由子类实现）
    protected abstract void brew();

    // 抽象方法：添加调料（由子类实现）
    protected abstract void addCondiments();

    // 钩子方法：默认返回 true，子类可以选择覆盖
    protected boolean customerWantsCondiments() {
        return true;
    }
}




