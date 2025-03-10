package 适配器与桥接模式.Adapt;


public class MyFruit {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyFruit(String name) {
        this.name = name;
    }
}
