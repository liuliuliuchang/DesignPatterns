package 外观与享元模式.Fac;

public class Client {
    public static void main(String[] args) {
        GenneralSwitchFaced gfs = new GenneralSwitchFaced();
        gfs.on();
        System.out.println("------------------------------");
        gfs.off();
    }
}
