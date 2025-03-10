package 适配器与桥接模式.BridgingMode;

public abstract class Pen {
    protected String color;

    public Pen(String color) {
        this.color = color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public abstract void draw(String name);
}
