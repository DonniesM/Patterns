package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        pattern15(n);
    }
    static void pattern15(int n){
        for(int row=1;row<2*n;row++){
            int spaces = row<=n ? n-row : row-n;
            int colStart = row<=n ? n-row+1 : row-n+1;
            int colEnd =  (row<=n)&&(row!=1)&&(row!=2*n-1)?(2*n-n+row-1):(2*n-colStart);
            for(int s=1;s<=spaces;s++){
                System.out.print("  ");
            }
            for(int col = colStart;col<2*n;col++){
                if(col!=colStart && col!=colEnd){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
        }
    }
}
