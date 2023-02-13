public class Magazine implements Printable{
    private String name;

    public Magazine(String name) {
        this.name = name;
    }
public static void printMagazines(Printable[] printables) {
        System.out.println("Названия только журналов:");
        for (Printable printable : printables) {
            if(printable instanceof Magazine) {
                System.out.println(((Magazine) printable).name);
            }
        }
}
    @Override
    public void print() {
    }
    }
