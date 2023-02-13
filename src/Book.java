public class Book implements Printable{
private String name;

    public Book(String name) {
        this.name = name;
    }
    public static void printBooks(Printable[] printables) {
        System.out.println("Названия только книг:");
        for (Printable printable : printables) {
            if(printable instanceof Book) {
                System.out.println(((Book) printable).name);
            }
        }
    }

    @Override
    public void print() {


    }
}
