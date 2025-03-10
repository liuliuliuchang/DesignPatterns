package 适配器与桥接模式.Adapt;

public class OldJuicer {
    public String onePort(MyFruit fruit){
        String str = fruit.getName()+"果汁";
        return str;
    }
}
