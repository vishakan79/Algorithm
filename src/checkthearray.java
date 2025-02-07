import java.util.*;
public class checkthearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<=arr.length-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(arrayd(arr));
    }
    public static boolean arrayd(int[] arr)
    {
        for(int i=1;i<=arr.length-1;i++)
        {
            if(arr[i]>=arr[i-1])
            {

            }
            else {
                return false;
            }
        }
        return true;
    }
}
