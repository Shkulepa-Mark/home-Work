package HomeWork_3;

import java.util.Scanner;

public class BubbleSort {
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

    void bubble(int []arr, int size){
        int temp = 0;

        for(int i = 0; i < size; i++){
            for(int j = i + 1; j < size; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    void mainSort(){
        System.out.println("Enter size of array: ");
        int size = scanner.nextInt();

        int []arr = new int[size];

        typeOfFill(arr,size);

        System.out.println("Ur array: ");
        printArray(arr,size);

        bubble(arr,size);

        System.out.println("Sorted arr: ");
        printArray(arr,size);
    }
}
