package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        pattern10(n);
    }

    static void pattern10(int n) {
        for (int row = 1; row <= n; row++) {
            for (int s = 1; s <= n - row; s++) {
                System.out.print(" ");
            }
            for (int col = n - row + 1; col < (2 * n - n) + row; col += 2) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
