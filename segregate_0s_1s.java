public class segregate_0s_1s {
    public static void main(String[] args) {
        int arr[]={0,1,0,1,0,1,0};
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)
            {
                arr[j++]=arr[i];
            }
        }
        while (j<arr.length) {
            arr[j++]=1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
