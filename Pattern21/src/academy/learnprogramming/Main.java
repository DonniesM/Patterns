package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        pattern21(n);
    }
    static void pattern21(int n){
        int count = 0;
        for(int row = 1;row<=n; row++){
            for(int col=1;col<=row;col++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println("");
        }
    }
}
