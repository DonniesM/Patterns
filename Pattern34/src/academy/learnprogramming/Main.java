package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        pattern34(n);
    }
    static void pattern34(int n){

        for(int row=n;row>=1;row--){
            int alphabet = 65+(row-1);
            for(int col=n;col>=n-row+1;col--){
                System.out.print((char)(alphabet));
                alphabet--;
            }
            System.out.println(" ");
        }
    }
}
