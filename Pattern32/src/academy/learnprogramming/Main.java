package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        pattern32(n);
    }
    static void pattern32(int n){
        int alphabet = 65+(n-1);
        for(int row=1;row<=n;row++){
            for(int col=row;col>=1;col--){
                System.out.print((char)(alphabet-col+1)+" ");
            }
            System.out.println("");
        }

    }
}
