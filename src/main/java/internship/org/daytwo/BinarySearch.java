package internship.org.daytwo;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(String[] arr, String user, int start, int end){
        if(start<end){
        // if(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid].compareToIgnoreCase(user)==0)
                return mid;
            else if(arr[mid].compareToIgnoreCase(user)>0)
                // return binarySearch(arr, user, start, mid-1);
                return binarySearch(arr, user, start, mid);
            else
            return binarySearch(arr, user, mid+1, end);
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] myTech = {"Angular", "Django",  "Express", "Flask", "Hibernate", "Node", "React", "Spring", "Vue"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell us tech to search ");
        String userInput = scanner.next();
        int found = binarySearch(myTech, userInput, 0, myTech.length-1);
        System.out.println(userInput+" found @ "+found);
        scanner.close();
    }
    
}
