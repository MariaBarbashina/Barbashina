package second;
import java.util.Scanner;

public class GraphicEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ImageFactory factory = null;

        System.out.println("Графический редактор. Поддерживаемые форматы: JPG, PNG, GIF.");

        while (true) {
            System.out.print("Введите формат (jpg, png, gif) или 'exit' для выхода: ");
            String format = scanner.nextLine().toLowerCase();

            if (format.equals("exit")) {
                System.out.println("Выход из редактора. Спасибо за использование!");
                break;
            }

            switch (format) {
                case "jpg":
                    factory = new JpgFactory();
                    break;
                case "png":
                    factory = new PngFactory();
                    break;
                case "gif":
                    factory = new GifFactory();
                    break;
                default:
                    System.out.println("Неподдерживаемый формат: " + format);
                    continue;
            }

            ImageLoader loader = factory.createLoader();
            ImageSaver saver = factory.createSaver();

            System.out.print("Введите имя файла для загрузки: ");
            String fileName = scanner.nextLine();
            loader.load(fileName);

            System.out.print("Введите имя файла для сохранения: ");
            String saveFileName = scanner.nextLine();
            saver.save(saveFileName);
        }

        scanner.close();
    }
}
