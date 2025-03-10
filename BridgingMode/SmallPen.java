package 适配器与桥接模式.BridgingMode;

public class SmallPen extends Pen {

    public SmallPen(String color) {
        super(color);
    }

    @Override
    public void draw(String name) {
        String penType = "小号毛笔绘制";
        System.out.println(penType+name);
    }
}
