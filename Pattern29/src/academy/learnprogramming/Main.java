package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        pattern29(n);
    }

    static void pattern29(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int colLStart = row <= n ? 1 : 1;
            int colLEnd = row <= n ? row : 2 * n - row + 1;
            int colRStart = row <= n ? 2 * n - row + 1 : row;
            int colREnd = row <= n ? 2 * n : 2 * n;

            for (int col = colLStart; col <= colLEnd; col++) {
                System.out.print("*");
            }
            for (int col = colLEnd; col <= n; col++) {
                System.out.print(" ");
            }
            for (int col = n + 1; col < colRStart; col++) {

                System.out.print(" ");

            }
            for (int col = colRStart; col <= colREnd; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
