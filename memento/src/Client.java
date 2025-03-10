public class Client {
    private static int index = -1;
    private static CaretakerChess caretakerChess = new CaretakerChess();

    public static void play(OriginatorChess chess) {
        index++;
        caretakerChess.add(chess.save());
        chess.show();
    }

    public static void undo(OriginatorChess chess) {
        System.out.println("********悔棋********");
        index--;
        System.out.println("悔棋到：" + index);
        chess.restore(caretakerChess.get(index));
        chess.show();
    }

    public static void redo(OriginatorChess chess) {
        System.out.println("********撤销悔棋********");
        index++;
        System.out.println("撤销到：" + index);
        chess.restore(caretakerChess.get(index));
        chess.show();
    }

    public static void main(String[] args) {
        OriginatorChess chess = new OriginatorChess(new MementoChess("黑", 2, 2));
        play(chess);//0
        chess.setX(3);
        play(chess);//1
        chess.setY(6);
        play(chess);//2
        undo(chess);//1
        undo(chess);//0
        redo(chess);//1
        redo(chess);//2
    }
}