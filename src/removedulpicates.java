import java.util.*;
public class removedulpicates {
    public static void main(String[] args) {
    int arr[]={1,1,2,2,2,3,3,3};
    for(int i=0;i<=arr.length-1;i++)
    {
        System.out.print(arr[i]+" ");
    }
    int rd=depulticate(arr);
    System.out.println();
    for(int i=0;i<=rd;i++)
    {
        System.out.print(arr[i]+" ");
    }

    }
    public static int depulticate(int[] arr)
    {
        int rd=0;
        for(int i=1;i<=arr.length-1;i++)
        {
            if(arr[rd]!=arr[i])
            {
                rd++;
                arr[rd]=arr[i];
            }
        }
        return rd;
    }
}
