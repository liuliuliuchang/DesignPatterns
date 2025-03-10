package 适配器与桥接模式.Adapt;

public class Adapter implements InewJuicer {
    private OldJuicer oldJuicer;

    // 构造函数中初始化 oldJuicer
    public Adapter() {
        this.oldJuicer = new OldJuicer();
    }

    public String newPort(MyFruit fruit1, MyFruit fruit2) {
        String str = "混合果汁" + oldJuicer.onePort(fruit1);
        str += oldJuicer.onePort(fruit2);
        return str;
    }
}
