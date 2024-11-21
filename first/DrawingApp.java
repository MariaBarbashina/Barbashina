package first;
import java.util.Scanner;

public class DrawingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tool currentTool = null;

        System.out.println("Добро пожаловать в приложение для рисования!");
        System.out.println("Выберите инструмент: pencil, brush, eraser");

        while (true) {
            System.out.print("Введите инструмент или 'exit' для выхода: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Выход из приложения. Спасибо за использование!");
                break;
            }

            try {
                currentTool = ToolFactory.getTool(input);
                System.out.print("Использование инструмента: ");
                currentTool.use();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
