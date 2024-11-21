package eighth;
import java.util.Scanner;

public class ImageEditorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Image image = new Image("Оригинал");
        History history = new History();

        System.out.println("Редактор изображений запущен.");
        System.out.println(image);

        while (true) {
            System.out.println("\nДоступные действия:");
            System.out.println("1 - Применить изменение");
            System.out.println("2 - Отменить последнее изменение");
            System.out.println("3 - Показать текущее состояние");
            System.out.println("4 - Выход");
            System.out.print("Введите команду: ");

            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1:
                    System.out.print("Введите описание изменения (например, 'фильтр', 'обрезка'): ");
                    String change = scanner.nextLine();
                    history.save(image.save());
                    image.applyChange(change);
                    System.out.println("Изменение '" + change + "' применено.");
                    break;

                case 2:
                    if (history.hasHistory()) {
                        image.restore(history.undo());
                        System.out.println("Последнее изменение отменено.");
                    } else {
                        System.out.println("История изменений пуста.");
                    }
                    break;

                case 3:
                    System.out.println(image);
                    break;

                case 4:
                    System.out.println("Выход из редактора. Спасибо за использование!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверная команда.");
            }
        }
    }
}
