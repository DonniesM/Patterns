package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n =  sc.nextInt();
        pattern19(n);
    }
    static void pattern19(int n){
        for(int row=1;row<2*n;row++){
            int colEnd = row<=n?row:2*n-row;
            int spaceStart = row<=n?row+1:2*n-row+1;
            int spaceEnd = row<=n?2*n-row:row;
            int colSecStart = spaceEnd+1;
            for(int col=1;col<=colEnd;col++){
                System.out.print("* ");
            }
            for(int sp = spaceStart;sp<=spaceEnd;sp++){
                System.out.print("  ");
            }
            for(int col=colSecStart;col<=2*n;col++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
