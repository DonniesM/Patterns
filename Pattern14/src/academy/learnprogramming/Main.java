package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        pattern14(n);
    }
    static void pattern14(int n){
        for(int row=1;row<=n;row++){
            for(int s=1;s<row;s++){
                System.out.print("  ");
            }
            for(int col=row;col<=2*n-row;col++){
                if(row!=1){
                    if(col!=row && col!=2*n-row){
                        System.out.print("  ");
                    }
                    else {
                        System.out.print(" *");
                    }
                }
                else{
                    System.out.print(" *");
                }

            }
            System.out.println(" ");
        }
    }
}
