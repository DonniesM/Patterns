package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println();
        pattern16(n);
    }
    static void pattern16(int n){
        int[][] PascalTriangle = new int[n][2*n];

        for(int row = 0; row<n; row++){

            for(int s=0;s<n-row-1;s++){
                System.out.print(" ");
            }
            int colValue = 0;
            for(int col = n-row;col<=2*n-n+row;col+=2){
                colValue = ((col!=n-row)&&(col!=2*n-n+row))?PascalTriangle[row-1][col-1]+PascalTriangle[row-1][col+1]:1;
                PascalTriangle[row][col]=colValue;
                System.out.print(PascalTriangle[row][col]+" ");
            }
            System.out.println(" ");
        }
    }

}
