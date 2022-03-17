class delete_array_ele {
    public static void main(String[] args) {
        int arr[]={1,8,3,0,4};
        int ele=8;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==ele)
            {
                for (int j = i; j < arr.length-1; j++) {
                    arr[j]=arr[j+1];
                }
                break;
            }
        }
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i]);
        }
    }
}