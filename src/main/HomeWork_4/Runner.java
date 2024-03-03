package HomeWork_4;

import java.util.Scanner;

public class Runner {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Choose the task (1,2,3,4,5): ");

        int select = scanner.nextInt();

        switch (select) {
            case 1: {
                FirstTask replaceText = new FirstTask();
                replaceText.text();
                break;
            }
            case 2: {
                SecondTask welcome = new SecondTask();
                welcome.welcomeTms();
                break;
            }
            case 3: {
                ThirdTask replaceBefAft = new ThirdTask();
                replaceBefAft.replaceSymbol();
                break;
            }
            case 4: {
                FourthTask day = new FourthTask();
                day.badDay();
                break;
            }
            case 5: {
                FifthTask pass = new FifthTask();
                pass.mainStr();
                break;
            }
            default:
                System.out.println("Wrong!");
                break;
        }
    }
}
