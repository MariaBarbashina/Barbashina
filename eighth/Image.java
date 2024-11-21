package eighth;

public class Image {
    private String state;

    public Image(String initialState) {
        this.state = initialState;
    }

    public void applyChange(String change) {
        state = state + " -> " + change;
    }

    public String getState() {
        return state;
    }

    public ImageMemento save() {
        return new ImageMemento(state);
    }


    public void restore(ImageMemento memento) {
        this.state = memento.getState();
    }

    @Override
    public String toString() {
        return "Текущее состояние изображения: " + state;
    }
}
