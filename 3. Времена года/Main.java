public class Main {
    public static void main(String[] args) {
        ВременаГода временаГода = ВременаГода.ВЕСНА;
        System.out.println(временаГода);
        print(временаГода.ВЕСНА);
        ВсяСредТемп();
    }
    public static void print(ВременаГода временаГода) {
        switch (временаГода) {
            case ЛЕТО:
                System.out.println("Я люблю лето");
                break;
            case ОСЕНЬ:
                System.out.println("Я люблю осень");
                break;
            case ЗИМА:
                System.out.println("Я люблю зиму");
                break;
            case ВЕСНА:
                System.out.println("Я люблю весну");
                break;

        }
    }
    public static void ВсяСредТемп() {
        for (ВременаГода временаГода : ВременаГода.values()) {
            System.out.println(временаГода + ": " + временаГода.getСредняяТемпература() + " " + временаГода.getDescription());
        }
    }
}