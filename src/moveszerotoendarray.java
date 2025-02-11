import java.util.*;
public class moveszerotoendarray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr={0,5,10,0,8};
        algorthim(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void algorthim(int[] arr)
    {
        int zeroIndex=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[zeroIndex]=arr[i];
                zeroIndex++;
            }
        }
        for(int i=zeroIndex+1;i<arr.length;i++)
        {
            arr[i]=0;
        }

    }
}
