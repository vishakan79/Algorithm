import java.util.*;
public class rotationnormal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr =new int[5];
        int roatation=sc.nextInt();
        for(int i=0;i<=arr.length-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        rotate(arr,roatation);
        for(int i:arr)
        {
            System.out.print(i);
        }
    }
    public static void rotate(int [] arr,int rote)
    {
        rote=rote % arr.length;
        for(int i=0;i<rote;i++)
        {
            int temp=arr[0];
            for(int j=1;j<arr.length;j++)
            {
                arr[j-1]=arr[j];
            }
            arr[arr.length-1]=temp;
        }

    }
}
