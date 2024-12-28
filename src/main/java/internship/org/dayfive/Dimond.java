package internship.org.dayfive;

import java.util.Scanner;

public class Dimond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell us dimond depth ");
        int dimond = scanner.nextInt();
        int mid = dimond/2+1;// 5/2+1>>3
        for(int row=1;row<=mid;row++){
            // space
            for(int space=dimond-1;space>=row;space--){
                System.out.print(" ");
            }
            // content
            for(int data=1;data<=row*2-1;data++){
                System.out.print("#");
            }
            System.out.println();
        }
        // lower
        for(int row=mid-1;row>0;row--){
            // space
            for(int space=dimond-1;space>=row;space--){
                System.out.print(" ");
            }
            // content
            for(int data=1;data<=row*2-1;data++){
                System.out.print("#");
            }
            System.out.println();
        }
        scanner.close();
    }
}
