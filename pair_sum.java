public class pair_sum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int sum=9;
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            if(arr[start]+arr[end]>sum)
            {
                end--;
            }
            else if(arr[start]+arr[end]<sum)
            {
                start++;
            }
            else
            {
                System.out.println("Pairs"+arr[start]+" "+arr[end]);
                start++;
                end--;
            }
        }
    }
}
