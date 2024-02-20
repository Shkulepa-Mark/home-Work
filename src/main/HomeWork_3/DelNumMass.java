package HomeWork_3;

import java.util.Scanner;

public class DelNumMass {
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

    int checkNumInArr(int[] arr, int size) {
        System.out.println("Write num: ");
        int num = scanner.nextInt();

        int sizeOfRes = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] != num) {
                arr[sizeOfRes++] = arr[i];
            }
        }

        return sizeOfRes;
    }

    void mass () {
        System.out.println("Enter size of array: ");
        int sizeOfArr = scanner.nextInt();
        int[] array = new int[sizeOfArr];

        System.out.println("Select array filling type: ");
        System.out.println("1. Write by hand");
        System.out.println("2. Fill by index");
        System.out.println("3. Random numbers");

        int select = scanner.nextInt();

        switch (select) {
            case 1: {
                fillByHand(array, sizeOfArr);
                break;
            }
            case 2: {
                fillByIndex(array, sizeOfArr);
                break;
            }
            case 3: {
                fillByRandom(array, sizeOfArr);
                break;
            }
            default: {
                System.out.println("Wrong!");
                break;
            }
        }

        System.out.println("Ur array: ");
        printArray(array, sizeOfArr);

        int newSize = checkNumInArr(array, sizeOfArr);

        if (newSize == sizeOfArr) {
            System.out.println("Num doesn't extist in array");
        } else {
            System.out.println("Updated array without num: ");
            printArray(array, newSize);
        }


    }
}