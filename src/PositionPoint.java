public class PositionPoint {
    private int x,y;
    private int power;
    private boolean isOn;

    public PositionPoint(int x, int y, int power, boolean isOn) {
        this.x = x;
        this.y = y;
        this.power = power;
        this.isOn = isOn;
    }

    @Override
    public String toString() {
        return "PositionPoint{" +
                "x=" + x +
                ", y=" + y +
                ", power=" + power +
                ", isOn=" + isOn +
                '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
