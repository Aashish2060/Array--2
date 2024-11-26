 import java.util.*;
public class prefix_sum {

    public static void prefixSum(int arr[]){
        int currentSum= 0;
        int max_sum=Integer.MIN_VALUE;
        //using prefix for calculation
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++)
        {int start=i;
            for(int j =i;j<arr.length;j++){
                int end=j;
                currentSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(max_sum<currentSum)
                {
                    max_sum=currentSum;
                }
            }
        }
        System.out.println(max_sum);
    }
    public static void main(String[] args)
    {
        int arr[]={3,4,55,56,6,7,2,9};
        prefixSum(arr);

    }
}
