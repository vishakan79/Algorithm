import java.util.*;
public class selectionsort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr= new int [size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sorta(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }

    }
    public static void sorta(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n-2;i++)
        {
            int mini=i;
            for(int j=i;j<n-1;j++)
            {
                if(arr[j] < arr[mini])
                {
                    mini=j;
                }
            }
            int temp =arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }

    }
}
