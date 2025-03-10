package 适配器与桥接模式.BridgingMode;

public class MiddlePen extends Pen {
    public MiddlePen(String color) {
        super(color);
    }

    @Override
    public void draw(String name) {
        String penType = "小号毛笔绘制";
        System.out.println(penType+name);
    }
}
