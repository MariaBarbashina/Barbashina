package sixth;

public abstract class Animation {

    public final void updateAnimation() {
        initialize();
        applyAnimation();
        finalizeAnimation();
    }


    protected void initialize() {
        System.out.println("Инициализация анимации...");
    }

    protected void finalizeAnimation() {
        System.out.println("Завершение анимации.");
    }


    protected abstract void applyAnimation();
}
