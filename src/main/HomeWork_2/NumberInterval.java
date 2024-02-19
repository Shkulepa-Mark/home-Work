package HomeWork_2;

import java.util.Scanner;

public class NumberInterval {
    Scanner scanner = new Scanner(System.in);
    public void interval(){
        System.out.println("Enter ur number(0-100): ");
        int number = scanner.nextInt();

        if(number>=0 && number<=100)
        {
            if(number<15)
            {
                System.out.println("Number exists in [0;14]");
            }
            else if(number<36)
            {
                System.out.println("Number exists in [15;35]");
            }
            else if(number<51)
            {
                System.out.println("Number exists in [36;50]");
            }
            else
            {
                System.out.println("Number exists in [51;100]");
            }
        }
        else
        {
            System.out.println("The number is not included in the range");
        }
    }
}

