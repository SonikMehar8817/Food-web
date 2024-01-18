// 1 2 3 4 5 
// 2 3 4 5   
// 3 4 5     
// 4 5       
// 5
package Patterns;

import java.util.*;
public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        sc.close();
       
          int b = 0;
        for(int i=1;i<=n;i++)
        {
            int a=1+b;
           for(int j=1;j<=n;j++)
           {
             if(j<=n+1-i){
                System.out.print(a+" ");
                a++;
              
             }
             else
             System.out.print("  ");
           }
           b++;
           System.out.println();
        }
    }
}
