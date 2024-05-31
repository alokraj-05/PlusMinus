import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int positiveCount = 0;
    int negativeCount = 0;
    int zeroCount = 0;
    List<Double> result = new ArrayList<>();
    for(int i=0;i<arr.size();i++){
        if(arr.get(i)==0){
            zeroCount++;
        }else if(arr.get(i)<0){
            negativeCount++;
        }else if(arr.get(i)>0){
            positiveCount++;
        }
    
    
    }
    double positiveRatio = (double)positiveCount/arr.size();
    double negativeRatio = (double)negativeCount/arr.size();
    double zeroRatio = (double)zeroCount/arr.size();
    
    result.add(positiveRatio);
    result.add(negativeRatio);
    result.add(zeroRatio);
    for(int i=0;i<result.size();i++){
        System.out.printf("%.6f\n",result.get(i));
    }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
