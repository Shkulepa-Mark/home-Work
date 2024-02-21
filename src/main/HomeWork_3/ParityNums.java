package HomeWork_3;

import java.util.Scanner;

public class ParityNums {
    Scanner scanner = new Scanner(System.in);

    void fillByHand(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    void fillByIndex(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
    }

    void fillByRandom(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }
    }

    void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    void typeOfFill(int []arr,int size) {
        System.out.println("Select array filling type: ");
        System.out.println("1. Write by hand");
        System.out.println("2. Fill by index");
        System.out.println("3. Random numbers");

        int select = scanner.nextInt();

        switch (select){
            case 1:{
                fillByHand(arr,size);
                break;
            }
            case 2:{
                fillByIndex(arr,size);
                break;
            }
            case 3:{
                fillByRandom(arr,size);
                break;
            }
            default:{
                System.out.println("Wrong!");
                break;
            }
        }
    }

    int sizeOfArr(){
        int sizeArr;

        do {
            System.out.print("Enter size of array (5 < size <= 10): ");

            while (!scanner.hasNextInt()) {
                System.out.println("Wrong: enter an integer!");
                scanner.next();
            }

            sizeArr = scanner.nextInt();
        } while (!(sizeArr > 5 && sizeArr <= 10));

        return sizeArr;
    }

    void mass () {
        int sizeArr = sizeOfArr();

        int[] firstMass = new int[sizeArr];
        int[] secondMass = new int [sizeArr];

        typeOfFill(firstMass,sizeArr);

        System.out.println("First array: ");
        printArray(firstMass, sizeArr);

        int newSize = 0;

        for (int i = 0; i < sizeArr; i++) {
            if (firstMass[i] % 2 == 0) {
                secondMass[newSize++] = firstMass[i];
            }
        }

        if(newSize != 0) {
            System.out.println("Second array: ");
            printArray(secondMass, newSize);
        }
        else{
            System.out.println("There are no even nums");
        }
    }
}
