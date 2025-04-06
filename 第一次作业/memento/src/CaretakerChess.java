import java.util.ArrayList;
import java.util.List;

public class CaretakerChess {
    private List<MementoChess> memList = new ArrayList<>();

    public void add(MementoChess memento) {
        memList.add(memento);
    }

    public MementoChess get(int index) {
        return memList.get(index);
    }
}
