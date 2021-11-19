package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n : ");
        int n =sc.nextInt();
        pattern28(n);
    }
    static void pattern28(int n){
        for ( int row = 0; row < 2 * n; row++){
            int totalColsInRow = row > n ? (2*n - row) : row;
            //int totalSpaces = row <= n ? (n-row) : (row-n);
            int totalSpaces = n-totalColsInRow;
            for(int s = 0; s < totalSpaces; s++){
                System.out.print(" ");
            }

            for(int col = 0; col < totalColsInRow ; col++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
