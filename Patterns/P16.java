//         1 
//       2 2 
//     3 3 3 
//   4 4 4 4 
// 5 5 5 5 5
package Patterns;

import java.util.*;
public class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        sc.close();

        for(int i=1;i<=n;i++)
        {
           
           for(int j=1;j<=n;j++)
           {
             if(j>=n+1-i){
                System.out.print(i+" ");
                
             }
             else
             System.out.print("  ");
           }
           System.out.println();
        }
    }
}
