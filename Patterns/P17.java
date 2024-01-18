//     5
//    54
//   543
//  5432
// 54321
package Patterns;

import java.util.*;
public class P17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        sc.close();

        for(int i=1;i<=n;i++)
        {
           int a = n;
           for(int j=1;j<=n;j++)
           {
             if(j>=n+1-i){
                System.out.print(a);
                a--;
             }
             else
             System.out.print(" ");
           }
           System.out.println();
        }
    }
}
