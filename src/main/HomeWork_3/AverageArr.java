package HomeWork_3;

import java.util.Scanner;

public class AverageArr {
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

    int midNum(int []arr,int size){
        int count = 0;
        int sum = 0;

        for(int i = 0; i < size; i++){
            sum += arr[i];
            count++;
        }

        return (sum / count);
    }

    void typeOfFill(int []arr) {
        System.out.println("Select array filling type: ");
        System.out.println("1. Write by hand");
        System.out.println("2. Fill by index");
        System.out.println("3. Random numbers");

        int select = scanner.nextInt();

        switch (select){
            case 1:{
                fillByHand(arr,5);
                break;
            }
            case 2:{
                fillByIndex(arr,5);
                break;
            }
            case 3:{
                fillByRandom(arr,5);
                break;
            }
            default:{
                System.out.println("Wrong!");
                break;
            }
        }
    }

    void mass () {
        int[] firstMass = new int[5];
        int [] secondMass = new int [5];

        typeOfFill(firstMass);

        System.out.println("Ur first array: ");
        printArray(firstMass, 5);

        typeOfFill(secondMass);

        System.out.println("Ur second array: ");
        printArray(secondMass, 5);

        int firstMid = midNum(firstMass,5);
        System.out.println("First mid number - " + firstMid);

        int secondMid = midNum(secondMass,5);
        System.out.println("Second mid number - " + secondMid);

        if(firstMid > secondMid){
            System.out.println("The average of first mass is greater");
        }
        else if(firstMid < secondMid){
            System.out.println("The average of second mass is greater");
        }
        else{
            System.out.println("The average values are equal");
        }
    }
}
