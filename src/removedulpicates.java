import java.util.*;
public class removedulpicates {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      Set<Integer>numbers=new HashSet<>();
      int num=0;
      for(int i=0;i<=5;i++)
      {
          num= sc.nextInt();
          numbers.add(num);
      }
      for(int numb:numbers)
      {
          System.out.println(numb);
      }
    }
}
