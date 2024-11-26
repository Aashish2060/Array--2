public class pairprint {
    public static void pairPrint(int arr[]){
        int total_pair=0;
        for(int i =0;i<arr.length;i++)
        {
            int current= arr[i];

            for(int j =i+1;j<arr.length;j++)
            {
                System.out.print("("+current+","+arr[i]+")");
                total_pair++;
            }
            System.out.println();
        }
        System.out.println("Total pair ="+total_pair);
    }
    public static void main(String[] args)
    {
        int arr[]={3,5,3,6,8,90};
        pairPrint(arr);
    }
}
