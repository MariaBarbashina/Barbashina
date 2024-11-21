package sixth;
import java.util.Scanner;

public class AnimationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа для создания анимаций. Доступные типы: move, rotate, scale.");

        while (true) {
            System.out.print("\nВведите тип анимации (move, rotate, scale) или 'exit' для выхода: ");
            String animationType = scanner.nextLine().toLowerCase();

            if (animationType.equals("exit")) {
                System.out.println("Выход из приложения. Спасибо за использование!");
                break;
            }

            Animation animation;
            switch (animationType) {
                case "move":
                    System.out.print("Введите начальные координаты (x y): ");
                    int startX = scanner.nextInt();
                    int startY = scanner.nextInt();
                    System.out.print("Введите конечные координаты (x y): ");
                    int endX = scanner.nextInt();
                    int endY = scanner.nextInt();
                    scanner.nextLine(); // Очистка буфера
                    animation = new MoveAnimation(startX, startY, endX, endY);
                    break;

                case "rotate":
                    System.out.print("Введите угол вращения: ");
                    int angle = scanner.nextInt();
                    scanner.nextLine(); // Очистка буфера
                    animation = new RotateAnimation(angle);
                    break;

                case "scale":
                    System.out.print("Введите коэффициент масштабирования: ");
                    double scaleFactor = scanner.nextDouble();
                    scanner.nextLine(); // Очистка буфера
                    animation = new ScaleAnimation(scaleFactor);
                    break;

                default:
                    System.out.println("Неверный тип анимации.");
                    continue;
            }

            System.out.println("\nЗапуск анимации:");
            animation.updateAnimation();
        }

        scanner.close();
    }
}
