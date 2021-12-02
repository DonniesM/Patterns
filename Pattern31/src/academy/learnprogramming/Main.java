package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        pattern31(n);
    }

    static void pattern31(int n) {

        for (int row = 1; row < 2 * n; row++) {
            int column = 1;
            int fill = row <= n ? row - 1 : 2 * n - row-1;
            int s = row<=n ? (((2 * n) - row) +1): row+1;
            int i = n;
            for (int f = 1; f <= fill; f++) {
                System.out.print(i + " ");
                i--;
            }
            if (row <= n) {
                for (int col = 2 * n - row; col >= row; col--) {
                    System.out.print(((n - row) + 1) + " ");
                }
            } else {
                for (int col = ((2 * n - row) ); col <= row; col++) {
                    System.out.print(((row - n) + 1) + " ");
                }
            }
            for (int sp = s; sp < 2*n ; sp++) {

                System.out.print((i+1)+" ");
                i++;

            }

            System.out.println(" ");

        }

    }
}
