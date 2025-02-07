import java.util.*;
public class bubblesort {
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
    public static void sortb(int[] arr)
    {
        int n=arr.length;
        for(int i=n-1;i>0;i--)
        {
            for(int j=0;j<=i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
}
