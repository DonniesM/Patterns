package academy.learnprogramming;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        pattern11(n);
    }

    static void pattern11(int n) {
        for (int row = 1; row <= n; row++) {
            for (int s = 1; s < row; s++) {
                System.out.print(" ");
            }
            for (int col = row; col <= 2 * n - row; col += 2) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
