package HomeWork_3;

import java.util.Scanner;

public class FindNum {
    Scanner scanner = new Scanner(System.in);

    void fillByRandom(int []arr,int size) {
        for(int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 100) + 5;
        }
    }

    void printArray(int []arr,int size) {
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    int maxNum(int []arr,int size){
        int max = 0;

        for(int i = 0; i < size; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        return max;
    }

    int minNum(int []arr,int size){
        int min = arr[0];

        for(int i = 0; i < size; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        return min;
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

    void mass () {
        System.out.println("Enter size of array: ");
        int sizeOfArr = scanner.nextInt();
        int[] array = new int[sizeOfArr];

        fillByRandom(array,sizeOfArr);

        System.out.println("Ur array: ");
        printArray(array, sizeOfArr);

        int maxNumber = maxNum(array,sizeOfArr);
        System.out.println("Max number - " + maxNumber);

        int minNumber = minNum(array,sizeOfArr);
        System.out.println("Min number - " + minNumber);

        int midNumber = midNum(array,sizeOfArr);
        System.out.println("Mid number - " + midNumber);
    }
}
