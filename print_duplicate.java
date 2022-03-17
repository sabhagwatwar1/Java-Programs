import java.util.HashSet;
import java.util.Set;

class print_duplicate
{
    public static void main(String[] args) {
        int arr[]={9,8,1,5,2};
        Set<Integer> uniqueNum=new HashSet<>();
        boolean dupli=false;
        for (int i = 0; i < arr.length; i++) {
            if(uniqueNum.contains(arr[i]))
            {
                dupli=true;
                System.out.println(arr[i]);
            }
            else
            {
                uniqueNum.add(arr[i]);
            }
        }
        if(!dupli)
        {
            System.out.println(-1);
        }
    }

}