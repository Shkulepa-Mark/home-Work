package HomeWork_5;

public class ATM {
    private int coins20;
    private int coins50;
    private int coins100;

    public int getCoins20() {
        return coins20;
    }

    public int getCoins50() {
        return coins50;
    }

    public int getCoins100() {
        return coins100;
    }

    public ATM(int coins20, int coins50, int coins100) {
        this.coins20 = coins20;
        this.coins50 = coins50;
        this.coins100 = coins100;
    }

    public void addMoney(int addCoins20, int addCoins50, int addCoins100) {
        coins20 += addCoins20;
        coins50 += addCoins50;
        coins100 += addCoins100;
    }

    public boolean withdrawMoney(int amount) {
        int remainingMoney = amount;

        int numOf100ToWithdraw = Math.min(remainingMoney / 100, this.coins100);
        remainingMoney -= numOf100ToWithdraw * 100;

        int numOf50ToWithdraw = Math.min(remainingMoney / 50, this.coins50);
        remainingMoney -= numOf50ToWithdraw * 50;

        int numOf20ToWithdraw = Math.min(remainingMoney / 20, this.coins20);
        remainingMoney -= numOf20ToWithdraw * 20;

        if (remainingMoney == 0) {
            this.coins100 -= numOf100ToWithdraw;
            this.coins50 -= numOf50ToWithdraw;
            this.coins20 -= numOf20ToWithdraw;

            System.out.println("Withdrawal successful");
            System.out.println("Number of 100 coins " + numOf100ToWithdraw);
            System.out.println("Number of 50 coins " + numOf50ToWithdraw);
            System.out.println("Number of 20 coins " + numOf20ToWithdraw);
            System.out.println();

            return true;
        } else {
            System.out.println("ATM doesn't have enough bills to fulfill the request.");
            return false;
        }
    }
}
