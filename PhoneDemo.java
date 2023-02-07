package First;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+78005553535", "Xiaomi", 8.0);
        Phone phone2 = new Phone("+79005553535", "Huawei", 7.9);
        Phone phone3 = new Phone();

        System.out.println(phone1.getNumber());
        System.out.println(phone1.getModel());
        System.out.println(phone1.getWeight());
        System.out.println();

        System.out.println(phone2.getNumber());
        System.out.println(phone2.getModel());
        System.out.println(phone2.getWeight());
        System.out.println();

        System.out.println(phone3.getNumber());
        System.out.println(phone3.getModel());
        System.out.println(phone3.getWeight());
        System.out.println();

        phone1.receiveCall("Артем Смирнов");
        phone2.receiveCall("Илья Николаев");
        phone2.receiveCall("Артем Хилков", "+77005553535");

        phone1.sendMessage("Message1111","+76005553535", "+75005553535");
        phone2.sendMessage("Message222","+74005553535");
    }
}
