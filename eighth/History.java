package eighth;
import java.util.Stack;

public class History {
    private Stack<ImageMemento> historyStack = new Stack<>();

    public void save(ImageMemento memento) {
        historyStack.push(memento);
    }

    public ImageMemento undo() {
        if (!historyStack.isEmpty()) {
            return historyStack.pop();
        }
        return null;
    }

    public boolean hasHistory() {
        return !historyStack.isEmpty();
    }
}
