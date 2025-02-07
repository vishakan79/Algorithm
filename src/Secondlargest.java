import java.util.*;
public class Secondlargest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<=arr.length-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        arrayc(arr);
    }
    public static void arrayc(int[] arr)
    {
        int largest=arr[0];
        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println("First largest Number:"+largest);
        int secondLargest=arr[0];
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i]>secondLargest && arr[i]!=largest)
            {
                secondLargest=arr[i];
            }
        }
        System.out.println("Second Largest :"+secondLargest);
    }
}
