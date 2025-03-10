package 适配器与桥接模式.BridgingMode;

public class Client {
    public static void main(String[] args) {
        Color color;
        Pen pen = new MiddlePen("蓝色");
        pen.setColor("蓝色");
        pen.draw("鲜花");
    }
}
