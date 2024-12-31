package internship.org.dayseven;

public class Stock {
    public static void bestTimeToBuyAndSell(int[] arr){
        if(arr.length<2){
            System.out.println("Invalid stock history");
        }
        else{
            // initial solution parameters
            int currentBuy=arr[0];// 90
            int currentSell=arr[1];// 40

            int maxProfit=currentSell-currentBuy;// -50

            //initial solution
            int currentProfit=Integer.MIN_VALUE;// -6

            for(int index=1;index<arr.length;index++){
                currentProfit=arr[index]-currentBuy;//4 - 10>> -6
                // -6 > -10
                if(currentProfit>maxProfit){
                    maxProfit=currentProfit;
                    currentSell=arr[index];//4
                }
                // 90 > 40, 40>20, 20>10, 10>4
                if(currentBuy>arr[index]){
                    currentBuy=arr[index];// 4
                }
            }
            //(10),4
            System.out.println("Best time to buy "+(currentSell-maxProfit)
                    +" best time to sell "+currentSell);
        }
    }

    public static void main(String[] args) {
//        int[] arr={45,12,3,10,50};
//        int[] arr={-10,-5,-2,-1,1};
        int[] arr={90,40,20,10,4};
        bestTimeToBuyAndSell(arr);
    }
}
