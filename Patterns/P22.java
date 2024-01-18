//     5
//    45
//   345
//  2345
// 12345
package Patterns;

import java.util.*;
public class P22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        sc.close();

        int b=n-1;
        for(int i=1;i<=n;i++)
        {
           int a = 1+b;
           for(int j=1;j<=n;j++)
           {
             if(j>=i){
                System.out.print(a);
                a--;
             }
             else
             System.out.print(" ");
           }
           b--;
           System.out.println()
           
        }
    }
}
