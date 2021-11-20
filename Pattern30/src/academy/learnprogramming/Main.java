package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern30(n);
    }
    static void pattern30(int n){

        for (int row = 1; row <= n; row++){
            int totalSpaces = n-row;
            for(int s = 1; s <= totalSpaces; s++){
                System.out.print("  ");// 2 spaces here so that they are aligned straight
            }
            for(int col = row; col >= 1; col--){
                System.out.print(" "+col);
            }
            System.out.print(" ");
            for(int col2 = 2; col2 <= row; col2++){
                System.out.print(col2+" ");
            }

            System.out.println(" ");
        }
    }
}
