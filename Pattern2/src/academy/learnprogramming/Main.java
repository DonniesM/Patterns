package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want : ");
        int n = sc.nextInt();
        pattern2(n);
    }
    static void pattern2(int n) {
        //row
        for (int row = 0; row < n; row++) {
            //for every row run the column
            for(int col = 0;col <= row;col++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
