package HomeWork_3;

import java.util.Scanner;

public class SumOfMatrix {
    Scanner scanner = new Scanner(System.in);

    void fillByHand(int [][]arr,int size){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    void fillRand(int [][]arr, int size){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                arr[i][j] = (int)(Math.random()*5)+1;
            }
        }
    }

    void fillIndex(int [][]arr, int size){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                arr[i][j] = i;
            }
        }
    }

    void fillMatrix(int [][]arr, int size){
        System.out.println("Select matrix filling type: ");
        System.out.println("1. Write by hand");
        System.out.println("2. Random nums");
        System.out.println("3. Fill by index");

        int select = scanner.nextInt();

        switch (select){
            case 1:{
                System.out.println("By hand");
                fillByHand(arr,size);
                break;
            }
            case 2:{
                System.out.println("Random nums");
                fillRand(arr,size);
                break;
            }
            case 3:{
                System.out.println("With indexes");
                fillIndex(arr,size);
                break;
            }
            default:{
                System.out.println("Wrong!");
                break;
            }
        }
    }

    void printMatrix(int [][]arr,int size){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    int sumMatrix(int [][]arr,int size){
        int sum = 0;

        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum += arr[i][j];
            }
        }

        return sum;
    }

    void mainMatrix() {
        System.out.println("Enter size of matrix: ");
        int size = scanner.nextInt();

        int[][] matrix = new int[size][size];

        fillMatrix(matrix, size);
        printMatrix(matrix, size);

        int sumOfMatrix = sumMatrix(matrix, size);

        System.out.println("Sum of elements: " + sumOfMatrix);
    }
}
