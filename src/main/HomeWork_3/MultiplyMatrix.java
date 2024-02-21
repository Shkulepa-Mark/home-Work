package HomeWork_3;

import java.util.Scanner;

public class MultiplyMatrix {
    Scanner scanner = new Scanner(System.in);

    void multyply(int [][]arr1, int [][]arr2, int [][]result){
        int size = 3;

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                for(int k = 0; k < size; k++){
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
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

    void mainMatrix(){
        int size = 3;

        int [][] arr1 = new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int [][] arr2 = new int [][]{{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
        int [][] result = new int[size][size];

        System.out.println("Fist matrix: ");
        printMatrix(arr1,size);

        System.out.println("Second matrix: ");
        printMatrix(arr2,size);

        multyply(arr1,arr2,result);

        System.out.println("Result of multiplication: ");
        printMatrix(result,size);
    }
}
