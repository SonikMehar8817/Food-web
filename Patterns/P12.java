package Patterns;

import java.util.*;
public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        sc.close();
       
        int b=n-1;
        for(int i=1;i<=n;i++)
        {
           int a = 1;
           for(int j=1;j<=n;j++)
           {
             if(j<=n+1-i){
                System.out.print(a+b+" ");
                a++;
              
             }
             else
             System.out.print("  ");
           }
           b--;
           System.out.println();
        }
    }
}
