package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements required : ");
        int n = sc.nextInt();
        pattern5(n);
    }

    //    static void pattern5(int n) {
//        int i = 1;
//
//        for (int row = 1; row <= 2 * n - 1; row++) {
//
//            if (row <= n) {
//                for (int col = 1; col <= row; col++) {
//                    System.out.print("* ");
//                }
//                System.out.println(" ");
//            } else {
////                if (row >= n) {
//                    for (int col = 1; col <= n-i; col++) {
//                        System.out.print("* ");
//
//                    }
//                    i++;
//                    System.out.println(" ");
////                }
//            }
//        }
//    }
//    static void pattern5(int n) {
//        int i = 0;
//
//        for (int row = 0; row < 2 * n; row++) {
//
//            if (row < n) {
//                for (int col = 0; col < row; col++) {
//                    System.out.print("* ");
//                }
//                System.out.println(" ");
//            } else {
//
//                for (int col = 0; col < n - i; col++) {
//                    System.out.print("* ");
//
//                }
//                i++;
//                System.out.println(" ");
//
//            }
//        }
//    }


    static void pattern5(int n) {


        for (int row = 0; row < 2 * n; row++) {

            if (row < n) {
                for (int col = 0; col < row; col++) {
                    System.out.print("* ");
                }
                System.out.println(" ");
            } else {

                for (int col = 0; col <(2*n-1) - row; col++) {
                    System.out.print("* ");

                }

                System.out.println(" ");

            }
        }
    }
}
