package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want : ");
        int n = sc.nextInt();
        pattern3(n);
    }

    //    static void pattern3(int n){
//        for(int row = 0; row < n; row++){
//            for(int col = n-1; col >= row; col--){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }
//    }
    //ANOTHER LOGIC
    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
