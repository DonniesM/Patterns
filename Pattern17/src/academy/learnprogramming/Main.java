package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

//        pattern17(n);
        pattern17k(n);

    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalSpaces = (row <= n) ? (n - row) : row - n;
            for (int s = 1; s <= totalSpaces; s++) {
                System.out.print("  ");
            }
            if (row <= n) {
                for (int col = row; col >= 1; col--) {
                    System.out.print(col + " ");
                }
                for (int col1 = 2; col1 <= row; col1++) {
                    System.out.print(col1 + " ");
                }
            } else {
                for (int col = 2 * n - row; col >= 1; col--) {
                    System.out.print(col + " ");
                }
                for (int col1 = 2; col1 <= 2 * n - row; col1++) {
                    System.out.print(col1 + " ");
                }

            }
            System.out.println(" ");
        }
    }

    static void pattern17k(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalColsInRows = (row <= n) ? row : (2 * n - row);
            for (int s = 1; s <= n - totalColsInRows; s++) {
                System.out.print("  ");
            }

            for (int col = totalColsInRows; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col1 = 2; col1 <= totalColsInRows; col1++) {
                System.out.print(col1 + " ");
            }

            System.out.println(" ");
        }
    }
}
