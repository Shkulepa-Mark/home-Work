package HomeWork_2;

import java.util.Scanner;

public class ParityOfNumbers {
    Scanner scanner = new Scanner(System.in);
    public void parity(){
        int num = scanner.nextInt();

        if(num%2 == 0)
        {
            System.out.println("Number " + num + " is even");
        }
        else
        {
            System.out.println("Number " + num + " is odd");
        }

        if(num % 10 == 0 || num % 10 == 2 || num % 10 == 4 || num % 10 == 6 || num % 10 == 8)
        {
            System.out.println("Number " + num + " is even");
        }
        else
        {
            System.out.println("Number " + num + " is odd");
        }
    }
}
