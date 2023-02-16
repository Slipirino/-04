public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle("фиолетовый", 4, 5, 10);
        shapes[1] = new Rectangle("желтый", 5, 5, 6, 6);

        for (Shape shape : shapes) {
            shape.draw();
        }


    }
}