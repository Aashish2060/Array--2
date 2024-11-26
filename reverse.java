import java.util.*;
public class reverse {
    public static void rev(int num[])
    {
        int first=0,last=num.length-1;
        while (first<last){
            int temp;
            temp=num[first];
            num[first]=num[last];
            num[last]=temp;
            first++;
            last--;
        }

    }

    public static void main(String[] args){
        int num[]={2,4,6,8,10};
        System.out.println("Before reverse");
        for(int i =0;i<num.length;i++)
        {
            System.out.print( num[i]+" ");
        }
        System.out.println();
        rev(num);
        System.out.println("After reverse");
        for(int i =0;i<num.length;i++)
        {
            System.out.print(num[i]+" ");
        }

    }

}
