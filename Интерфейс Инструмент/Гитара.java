public class Гитара implements Инструмент{
    int количествоСтрун;
    Гитара(int количествоСтрун) {
        this.количествоСтрун = количествоСтрун;
    }
    public void play() {
        System.out.println("Играет гитара " +количествоСтрун+ " струн");
    }
}
