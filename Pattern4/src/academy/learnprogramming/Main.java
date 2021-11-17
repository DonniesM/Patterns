package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements required : ");
        int n = sc.nextInt();
        pattern4(n);
    }
    static void  pattern4(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col+" ");
            }
            System.out.println(" ");
        }
    }
}
