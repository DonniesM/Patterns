package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        pattern18(n);

    }
    static void pattern18(int n){
        for(int row=1;row<=2*n;row++){
            int col1 = row<=n?n-row+1:row-n;
            for(int col=1;col<=n;col++){
                if(col<=col1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            for(int col=n+1;col<=2*n;col++){
                if(col<=2*n-col1){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}
