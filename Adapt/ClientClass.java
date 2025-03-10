package 适配器与桥接模式.Adapt;

public class ClientClass {
    public static void main(String[] args) {
        InewJuicer juicer = new Adapter();
        juicer.newPort(new MyFruit("苹果"),new MyFruit("香蕉"));
        System.out.println(juicer.newPort(new MyFruit("苹果"),new MyFruit("香蕉")));
    }
}
