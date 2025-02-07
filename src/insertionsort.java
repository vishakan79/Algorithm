import java.util.*;
public class insertionsort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<=arr.length-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        sortb(arr);
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void  sortb(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<=n-1;i++)
        {
            int j=i;
            while(j>0 && arr[j-1] >arr[j])
            {
               int temp=arr[j-1];
               arr[j-1]=arr[j];
               arr[j]=temp;
               j--;
            }
        }
    }
}
