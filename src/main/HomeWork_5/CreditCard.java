package HomeWork_5;

public class CreditCard {
    private String accountNumber;
    private double amountOnAccount;

    public double getAmountOnAccount() {
        return amountOnAccount;
    }

    public void setAmountOnAccount(double amountOnAccount) {
        this.amountOnAccount = amountOnAccount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double refillAccount(double refillAmount) {
        if (refillAmount <= 0) {
            System.out.println("Wrong! Please enter a positive value");
            return amountOnAccount;
        }

        amountOnAccount += refillAmount;
        System.out.println("Deposited: " + refillAmount + ". New balance: " + amountOnAccount);

        return amountOnAccount;
    }

    public double withdrawFromAccount(double withdrawAmount) {
        if (withdrawAmount > amountOnAccount) {
            System.out.println("Wrong! You don't have that much money");
            return amountOnAccount;
        }

        amountOnAccount -= withdrawAmount;
        System.out.println("You have withdraw from your account: " + withdrawAmount + ". New balance: " + amountOnAccount);

        return amountOnAccount;
    }

    public void currentAccount() {
        System.out.println("Current amount on " + getAccountNumber() + " : " + getAmountOnAccount());
    }
}
