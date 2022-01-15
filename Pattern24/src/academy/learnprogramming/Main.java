package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        pattern24(n);
    }
    static void pattern24(int n){
        for(int row=1;row<=2*n;row++){
            int colLStart=row<=n?1:1;
            int colLEnd=row<=n?row:2*n-row+1;
            int colRStart=row<=n?2*n-row+1:row;
            int colREnd=row<=n?2*n:2*n;

            for(int col=colLStart;col<=n;col++){
                if(col!=colLStart && col!=colLEnd){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            for(int col=n+1;col<=2*n;col++){
                if(col!=colRStart && col!=colREnd){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
