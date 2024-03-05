package HomeWork_5;

public class Runner {
    public static void main(String[] args) {
       /* Phone iphone = new Phone("123-456-789", "Iphone 15pro", 687.12);
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
        samsung.sendMessage("323-453-126");*/

        /*CreditCard card1 = new CreditCard();
        CreditCard card2 = new CreditCard();
        CreditCard card3 = new CreditCard();

        card1.setAccountNumber("1234-5678-9012-3456");
        card1.setAmountOnAccount(1252.52);
        card1.currentAccount();
        card1.refillAccount(200.47);

        card2.setAccountNumber("1544-1528-9312-9967");
        card2.setAmountOnAccount(1.25);
        card2.currentAccount();
        card2.refillAccount(500.23);

        card3.setAccountNumber("2423-1241-9232-5326");
        card3.setAmountOnAccount(1320.2);
        card3.currentAccount();
        card3.withdrawFromAccount(214.22);

        card1.currentAccount();
        card2.currentAccount();
        card3.currentAccount();*/

        ATM atm = new ATM(30, 15, 20);

        System.out.println("ATM status:");
        System.out.println("Number of 100 bills: " + atm.getCoins100());
        System.out.println("Number of 50 bills: " + atm.getCoins50());
        System.out.println("Number of 20 bills: " + atm.getCoins20());
        System.out.println();

        atm.addMoney(20, 25, 10);

        boolean withdrawalResult = atm.withdrawMoney(820);

        System.out.println("Updated ATM status:");
        System.out.println("Number of 100 bills: " + atm.getCoins100());
        System.out.println("Number of 50 bills: " + atm.getCoins50());
        System.out.println("Number of 20 bills: " + atm.getCoins20());
        System.out.println();

        if (withdrawalResult) {
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Withdrawal failed.");
        }
    }
}

