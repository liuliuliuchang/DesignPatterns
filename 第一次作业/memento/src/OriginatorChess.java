public class OriginatorChess {
    private MementoChess mementoChess;

    public OriginatorChess(MementoChess mementoChess) {
        this.mementoChess = mementoChess;
    }

    public void setX(int x) {
        mementoChess.setX(x);
    }

    public void setY(int y) {
        mementoChess.setY(y);
    }

    public MementoChess save() {
        return new MementoChess(mementoChess.getLabel(), mementoChess.getX(), mementoChess.getY());
    }

    public void restore(MementoChess mementoChess) {
        this.mementoChess.setLabel(mementoChess.getLabel());
        this.mementoChess.setX(mementoChess.getX());
        this.mementoChess.setY(mementoChess.getY());
    }

    public void show() {
        System.out.println("当前棋子状态：" + mementoChess.getLabel() + "(" + mementoChess.getX() + "，" + mementoChess.getY() + ")");
    }
}
