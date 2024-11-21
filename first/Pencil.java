package first;

public class Pencil implements Tool{
    @Override
    public void use() {
        System.out.println("Рисование карандашом...");
    }
}
