package HomeWork_5;

public class Runner {
    public static void main(String[] args) {
        Phone iphone = new Phone("123-456-789", "Iphone 15pro", 687.12);
        Phone xiomi = new Phone("752-631-812", "Redmi 13", 996.12);
        Phone samsung = new Phone("821-723-125", "S24", 686.12);

        System.out.println(iphone);
        iphone.receiveCall("Dad", "228-126-729");
        iphone.sendMessage("583-456-723", "473-123-723", "161-423-739");
        System.out.println();

        System.out.println(xiomi);
        xiomi.receiveCall("Vatalik", "991-456-921");
        xiomi.sendMessage("123-116-125", "111-223-228");
        System.out.println();

        System.out.println(samsung);
        samsung.receiveCall("Max", "233-336-812");
        samsung.sendMessage("323-453-126");
    }
}

