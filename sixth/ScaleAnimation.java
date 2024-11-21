package sixth;

public class ScaleAnimation extends Animation{
    private double scaleFactor;

    public ScaleAnimation(double scaleFactor) {
        this.scaleFactor = scaleFactor;
    }

    @Override
    protected void applyAnimation() {
        System.out.println("Анимация масштабирования с коэффициентом: " + scaleFactor + ".");
    }
}
