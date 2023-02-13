public class Труба implements Инструмент{
    int размер;
    Труба( int size ) {
        this.размер = размер;
    }
    public void play() {
        System.out.println("Играет труба с размером "+ размер);
    }
}
