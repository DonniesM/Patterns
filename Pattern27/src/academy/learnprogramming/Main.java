package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        pattern27(n);
    }

    static void pattern27(int n) {
        int count = 0;


        for (int row = 1; row <= n; row++) {
            int countRev = n * (n + 1);
            for (int sp = 1; sp <= row - 1; sp++) {
                System.out.print("  ");
            }
            for (int cola = row; cola <= n; cola++) {
                count++;
                System.out.print(count + " ");
            }
            int c = count;
            countRev += -c;
            for (int colb = n + 1; colb <= 2 * n - row + 1; colb++) {
                countRev++;

                System.out.print(countRev + " ");

            }
            System.out.println("  ");
        }
    }
}
