package internship.org.dayfive;

import java.util.Scanner;

public class Denom {
    public static void countCurrency(int amount)
    {
        int[] notes = new int[]{ 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        int[] noteCounter = new int[9];
     
        // count notes using Greedy approach
        for (int i = 0; i < 9; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }
     
        // Print notes
        System.out.println("Currency Count ->");
        for (int i = 0; i < 9; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                    + noteCounter[i]);
            }
        }
    }

    public static void gayathri(int arr[],int amount){
        int size=arr.length;
        int counts[]=new int[size];
        for(int i=0;i<=size-1;i++){
            int count=0;
            while (arr[i]<=amount) {
                count++;
                amount-=arr[i];
            }
            counts[i]=count;
        }
        for(int i=0;i<=size-1;i++){
            if(counts[i]!=0){
                System.out.println(arr[i]+":"+counts[i]);
            }
        }
    }

    
    // driver function 
    public static void main(String argc[]){
        int arr[]={500,200,100,50,20,10,5,2,1};
        int amount = 8710;
        //countCurrency(amount);
        gayathri(arr, amount);
    }
    public static void selvarasan(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Amount:");
        int amount= sc.nextInt();
        int[] notes={500,200,100,50,20,10,5,2,1};
        int[] notesCounter=new int[9];

        for(int i=0;i<9;i++){
            if(amount>=notes[i]){
                notesCounter[i]=amount/notes[i];
                amount=amount - notesCounter[i]*notes[i];
            }
            else{
                notesCounter[i]=0;
            }
            System.out.println(notes[i]+":"+notesCounter[i]);
        }
            sc.close();
        
    }

}
