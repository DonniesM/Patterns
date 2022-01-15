package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        pattern23Second(n);
    }

    static void pattern23Second(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col != n - row + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }


            if (row != 1) {
                for (int space = 1; space <= row - 2; space++) {
                    System.out.print(" ");
                }
                for (int col = row; col < (2 * n); col++) {

                    if (col != row && col != 2 * n - row) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            else {
                System.out.printf("%"+(2*n-2)+"s"," ");
            }
            for (int col = 1; col <= n; col++) {
                if (col != row) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
