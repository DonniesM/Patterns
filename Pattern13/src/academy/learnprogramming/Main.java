package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        pattern13(n);
    }
    static void pattern13(int n){
        int count =0;
        for(int row = 1;row<=n;row++){
            for(int s = 1; s<=n-row;s++){
                System.out.print("  ");
            }
            for(int col = n-row+1; col <2*n-n+row;col++){
                if(row!=n){
                    if((col!=n-row+1)&&(col!=2*n-n+row-1 )){
                        System.out.print("  ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
        }

    }
}
