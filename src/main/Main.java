package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner in = new Scanner(System.in);
        int value;

        System.out.println("Provide the numbers: ");
        for (int row = 0; row < matrix[0].length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = in.nextInt();
            }
        }

        System.out.print("Search a number: ");
        value = in.nextInt();
        in.close();

        for (int row = 0; row < matrix[0].length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == value) {
                    System.out.println("The number " + value + " is in the matrix at position: [" + row + "," + col + "]");
                }
            }
        }

        for (int indx = 0; indx < matrix[0].length; indx++) {
            if (matrix[indx][indx] == value && matrix[indx][(matrix[0].length - 1) - indx] == value) {
                System.out.println("The number is on both Diagonals");
            } else if (matrix[indx][(matrix[0].length - 1) - indx] == value) {
                System.out.println("The number is on the Secondary Diagonal");
            } else if (matrix[indx][indx] == value) {
                System.out.println("The number is on the Main Diagonal");
            }
        }
    }
}