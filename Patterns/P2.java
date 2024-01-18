package Patterns;
import java.util.*;;
public class P2 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        sc.close();

        for(int i=1;i<=n;i++)
        {
            int a = 1;
           for(int j=1;j<=n;j++)
           {
              System.out.print(a);
              a++;
           }
           System.out.println();
        }

   }

}
