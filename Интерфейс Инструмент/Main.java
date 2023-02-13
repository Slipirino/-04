public class Main {
    public static void main(String[] args) {
        Гитара гитара = new Гара(6);
        Барабан барабан = new Баритабан(50);
        Труба труба = new Труба(40);


        Инструмент [] инструменты = {гитара, барабан, труба};
        for (Инструмент инструмент : инструменты)
            Инструмент.play();

    }
}