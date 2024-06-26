import mypackage.display;
import sum.sum;
import java.util.*;

public class two {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      display d = new display();
      int a = sc.nextInt();
      int b = sc.nextInt();
      sum s = new sum();
      int res = s.add(a,b);
      System.out.println(res);
      

   }
}
