import java.io.*;
import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        
        for(int num:arr){
           if(num>0){
               positiveCount++;
           }else if(num<0){
               negativeCount++;
           }
            else{
               zeroCount++;
           }
        }
        int total = arr.length;
        double positiveRatio = (double) positiveCount/total;
        double negativeRatio = (double) negativeCount/total;
        double zeroRatio = (double) zeroCount/total;
        
        System.out.printf("%.6f\n",positiveRatio);    
        System.out.printf("%.6f\n",negativeRatio);   
        System.out.printf("%.6f\n",zeroRatio);   
    }
}
