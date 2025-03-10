package 外观与享元模式.Fly;

import java.util.HashMap;

public class PieceFactory {
    private HashMap<String, Apiece> PiecePool = new HashMap<>();

    public Apiece GetPiece(String key) {
        if (!PiecePool.containsKey(key)) {
            Apiece p = new OnePiece(key);
            PiecePool.put(key, p);
            return p;
        } else {
            return PiecePool.get(key);
        }
    }

    public int GetPieceCount() {
        return PiecePool.size();
    }
}
