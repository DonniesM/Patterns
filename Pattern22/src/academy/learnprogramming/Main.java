package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        pattern22(n);
    }
    static void pattern22(int n){
        for(int row=1;row<=n;row++){
            int c = (row%2!=0)?1:0;
            for(int col=1;col<=row;col++){
                System.out.print(c+" ");
                c = c==0?1:0;
            }
            System.out.println("");
        }
    }
}
