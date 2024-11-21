package sixth;

public class RotateAnimation extends Animation{
    private int angle;

    public RotateAnimation(int angle) {
        this.angle = angle;
    }

    @Override
    protected void applyAnimation() {
        System.out.println("Анимация вращения на угол: " + angle + " градусов.");
    }
}
