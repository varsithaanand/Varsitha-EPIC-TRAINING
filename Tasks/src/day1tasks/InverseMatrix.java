package day1tasks;

import java.util.Scanner;

public class InverseMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][2];

        System.out.println("Enter 4 elements:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int determinant = (a[0][0] * a[1][1])
                        - (a[0][1] * a[1][0]);

        if (determinant == 0) {
            System.out.println("Inverse does not exist");
        } 
        else {
            System.out.println("Inverse of the matrix:");

            System.out.println(
                a[1][1] / (double) determinant + " "
                + (-a[0][1]) / (double) determinant
            );

            System.out.println(
                (-a[1][0]) / (double) determinant + " "
                + a[0][0] / (double) determinant
            );
        }

    }
}
