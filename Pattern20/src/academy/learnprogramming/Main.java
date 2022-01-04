package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        pattern20(n);
    }
    static void pattern20(int n){
        for(int row=1;row<=n;row++){
            inner:
            for(int col=1;col<n;col++){
                if(row!=1 && row!=n){
                    if(col!=1 && col!=(n-1)){
                        System.out.print("  ");
                    }else{
                        System.out.print("* ");
                        continue inner;
                    }

                }
                else{
                    System.out.print("* ");
                }


            }
            System.out.println("");
        }
    }
}
