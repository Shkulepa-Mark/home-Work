package HomeWork_2;

import java.util.Scanner;

public class Calculator {
        Scanner scanner = new Scanner(System.in);
        public void calculate(){
            System.out.println("Enter two numbers: ");
            double operand1 = scanner.nextDouble();
            double operand2 = scanner.nextDouble();

            System.out.println("Choose operation: ");
            System.out.println("+");
            System.out.println("-");
            System.out.println("*");
            System.out.println("/");

            String sign = scanner.next();

            switch (sign)
            {
                case "+":
                {
                    System.out.println(operand1 + " + " + operand2 + " = " + (operand1+operand2));
                    break;
                }
                case "-":
                {
                    System.out.println(operand1 + " - " + operand2 + " = " + (operand1-operand2));
                    break;
                }
                case "*":
                {
                    System.out.println(operand1 + " * " + operand2 + " = " + (operand1*operand2));
                    break;
                }
                case "/":
                {
                    if(operand2 == 0)
                    {
                        System.out.println("Error! You can't divide by zero");
                        break;
                    }
                    else
                    {
                        System.out.println(operand1 + " / " + operand2 + " = " + (operand1/operand2));
                    }
                    break;
                }
                default:
                {
                    System.out.println("There is no such item in the calculator menu");
                    break;
                }
            }
        }
    }


