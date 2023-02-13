public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Колобок");
        Book book2 = new Book("Красная шапочка");
        Magazine magazine1 = new Magazine("Просто вкусно");
        Magazine magazine2 = new Magazine("Дачный сезон");

        Printable[] printables = {book1, book2, magazine1, magazine2};
        for (Printable printable : printables) {
            printable.print();

        }
        Magazine.printMagazines(printables);
        Book.printBooks(printables);


    }
}
