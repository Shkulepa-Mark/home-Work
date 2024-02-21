package HomeWork_3;

import com.sun.management.DiagnosticCommandMBean;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int select = scanner.nextInt();

        switch (select){
            case 1:{
                NumInMass massive = new NumInMass();
                massive.mass();
                break;
            }
            case 2:{
                DelNumMass delNum = new DelNumMass();
                delNum.mass();
                break;
            }
            case 3:{
                FindNum findN = new FindNum();
                findN.mass();
            }
            case 4:{
                AverageArr average = new AverageArr();
                average.mass();
                break;
            }
            case 5:{
                ParityNums parity = new ParityNums();
                parity.mass();
                break;
            }
            case 6:{
                DelOddNum oddNum = new DelOddNum();
                oddNum.mass();
                break;
            }
            case 7:{
                SortNames name = new SortNames();
                name.mainString();
                break;
            }
            case 8:{
                BubbleSort sort = new BubbleSort();
                sort.mainSort();
                break;
            }
            case 9:{
                MultiplyMatrix multiply = new MultiplyMatrix();
                multiply.mainMatrix();
                break;
            }
            case 10:{
                SumOfMatrix sumMatrix = new SumOfMatrix();
                sumMatrix.mainMatrix();
                break;
            }
            case 11:{
                DiagonalMatrix diagonal = new DiagonalMatrix();
                diagonal.mainMatrix();
                break;
            }
            case 12:{
                SortElements sort = new SortElements();
                sort.mainMatrix();
                break;
            }
            default:{
                System.out.println("Wrong");
                break;
            }
        }
    }
}
