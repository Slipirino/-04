import java.sql.SQLOutput;

public class Circle extends Shape{
    private int x, y, radius;

    public Circle(String color, int x, int y, int radius) {
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Рисую " + getColor() + " круг по координатам: " + x + " " + y + " " + radius);
    }
}
