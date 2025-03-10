package 外观与享元模式.Fly;

public abstract class Apiece {
    protected String inKind;
    public Apiece(String inKind) {
        this.inKind = inKind;
    }
    public abstract void Play(int x, int y);
}
