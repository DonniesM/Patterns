package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        pattern7(n);
    }

    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < row; col++) {
                System.out.print("  ");
            }
            for (int col1 = row; col1 <= n; col1++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
