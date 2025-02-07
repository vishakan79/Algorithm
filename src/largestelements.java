import java.util.*;
public class largestelements {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int arr[]=new int[size];
       for(int i=0;i<size;i++)
       {
           arr[i]=sc.nextInt();
       }
       arraya(arr);
       for(int b:arr)
       {
           System.out.println(b);
       }

    }
    public static void arraya(int arr[])
    {
        int temp;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j>arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
