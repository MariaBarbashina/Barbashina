package sixth;

public class MoveAnimation extends Animation{
    private int startX, startY, endX, endY;

    public MoveAnimation(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    @Override
    protected void applyAnimation() {
        System.out.println("Анимация перемещения: ");
        System.out.println("Перемещение из точки (" + startX + ", " + startY +
                ") в точку (" + endX + ", " + endY + ").");
    }
}
