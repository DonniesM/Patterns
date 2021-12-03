package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        pattern8(n);
    }
    static void pattern8(int n){
        int N = 2*n;
        for(int row = 1;row <= 5; row++){
            for(int s = 1; s <= n-row; s++){
                System.out.print("  ");
            }
            for(int col = n-row+1;col<N-n+row;col++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
