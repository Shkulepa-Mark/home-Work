package HomeWork_2;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("choose task: ");
        int select = scanner.nextInt();

        switch (select) {
            case 1: {
                Calculator calc = new Calculator();
                calc.calculate();
                break;
            }
            case 2:
            {
                NumberInterval numInterval = new NumberInterval();
                numInterval.interval();
                break;
            }
            case 3:
            {
                Translator translate = new Translator();
                translate.translate();
                break;
            }
            case 4:
            {
                ParityOfNumbers parityOfNum = new ParityOfNumbers();
                parityOfNum.parity();
                break;
            }
            default:
            {
                System.out.println("Wrong!");
                break;
            }
        }
    }
}