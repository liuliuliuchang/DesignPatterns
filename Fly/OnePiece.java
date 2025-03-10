package 外观与享元模式.Fly;

public class OnePiece extends Apiece{
    public OnePiece(String inKind) {
        super(inKind);
    }
    @Override
    public void Play(int x, int y) {
        System.out.println("把"+inKind+"子放到"+x+"，"+y+"的位置");
    }
}
