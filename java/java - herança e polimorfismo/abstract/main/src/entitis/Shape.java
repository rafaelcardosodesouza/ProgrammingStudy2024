package entitis;

public abstract class Shape {
    private Color color;

    public Color getColor() {
        return color;
    }

    public Shape(Color color) {
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public abstract double area();
}
