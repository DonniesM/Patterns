package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        pattern33(n);
    }
    static void pattern33(int n){
        int count = 0;
        int lowerCaseAlpha=97;
        int upperCaseAlpha =  65;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                count++;
                if(count%2!=0){
                    System.out.print((char)(lowerCaseAlpha));
                    lowerCaseAlpha+=2;
                }
                else{

                    System.out.print((char)(upperCaseAlpha+1));
                    upperCaseAlpha+=2;
                }
            }
            System.out.println(" ");
        }
    }
}
