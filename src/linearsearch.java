import java.util.*;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr={10,20,30,40,50};
        int key=sc.nextInt();
        search(arr,key);
    }
    public static void search(int[] arr,int key)
    {
        int flag=0;
        for(int i=0;i<=arr.length-1;i++)
        {
            if(key==arr[i])
            {
                System.out.println("found index :"+i);
                flag=1;
            }
        }
        if(flag!=1)
        {
            System.out.println("not found");
        }
    }
}
