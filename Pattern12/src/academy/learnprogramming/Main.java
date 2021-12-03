package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        pattern12(n);
    }

    static void pattern12(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int columnStart = row <= n ? row : (2 * n - row) + 1;
            int columnEnd = row <= n ? 2 * n - row : row - 1;
            int spacesEnd = row <= n ? row - 1 : 2 * n - row;
            for (int s = 1; s <= spacesEnd; s++) {
                System.out.print(" ");
            }
            for (int col = columnStart; col <= columnEnd; col += 2) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
