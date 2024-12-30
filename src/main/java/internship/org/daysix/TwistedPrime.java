package internship.org.daysix;

import java.util.Scanner;

public class TwistedPrime {
    public static int isTwistedPrime(int number){
        // check given is prime or not
        if(number==2||number==3||number==5||number==7||number%2!=0&&number%3!=0&&number%5!=0&&number%7!=0){
            System.out.println("Given "+number+" is prime");
            StringBuilder temp = new StringBuilder(Integer.valueOf(number).toString(number));
            int reversed = Integer.parseInt(temp.reverse().toString());
            System.out.println("Reversed number "+reversed);
            if(reversed==2||reversed==3||reversed==5||reversed==7||reversed%2!=0&&reversed%3!=0&&reversed%5!=0&&reversed%7!=0)
                return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find twisted prime or not ");
        int number = scanner.nextInt();
        System.out.println(isTwistedPrime(number));
        scanner.close();
    }
}
