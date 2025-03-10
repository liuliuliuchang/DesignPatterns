package 外观与享元模式.Fac;

public class Light {
    private String position;

    public Light(String position){
        this.position = position;
    }
    public void on(){
        System.out.println(position + "灯亮了");
    }
    public void off(){
        System.out.println(position + "灯灭了");
    }
}
