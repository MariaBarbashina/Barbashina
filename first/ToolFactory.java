package first;

public class ToolFactory {
    public static Tool getTool(String toolType) {
        switch (toolType.toLowerCase()) {
            case "pencil":
                return new Pencil();
            case "brush":
                return new Brush();
            case "eraser":
                return new Eraser();
            default:
                throw new IllegalArgumentException("Неизвестный инструмент: " + toolType);
        }
    }
}
