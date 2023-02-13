public class Барабан implements Инструмент{
    int диаметр;
    Барабан(int диаметр) {
        this.диаметр= диаметр;
    }
    public void play() {
        System.out.println("Играет барабан с диаметром "+ диаметр);
    }
}
