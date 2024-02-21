package HomeWork_3;

import java.util.Scanner;
import java.util.Arrays;

public class SortNames {
    Scanner scanner = new Scanner(System.in);

    void printArray(String [] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    void sortNames(String [] arr){
        Arrays.sort(arr);
    }

    void mainString(){
        System.out.println("Enter size of string: ");
        int size = scanner.nextInt();

        String [] arr = new String[size];

        System.out.println("Write names: ");
        for(int i = 0; i < size; i++){
            arr[i] = scanner.next();
        }

        System.out.println("Names: ");
        printArray(arr,size);

        sortNames(arr);

        System.out.println("Sorted array: ");
        printArray(arr,size);
    }
}
