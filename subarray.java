public class subarray {
    public static void subArray(int arr[])
    {
        int total=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++)
            {
                int end =j;

                for(int k=start;k<=end;k++)

                {
                    System.out.print(arr[k]+" ");
                    total++;
                    sum+=arr[k];
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total no of subarray is "+total);
        System.out.println("sum no of subarray is "+sum);
    }
    public static void main(String[] args)
    {
        int arr[]={4,65,55,6,65,56,2,4};
        subArray(arr);
    }
}
