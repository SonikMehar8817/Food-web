//     *     
//   * * *   
// * * * * * 
//   * * *   
//     *     

import java.util.Scanner;
public class pattern13 {
   // public static void main(String[] args) {
   //  int n = 5;

   //     for(int r=1;r<=n;r++)
   //     {
   //      for(int c=1; c<=n; c++)
   //      {
   //          if((c%2==0 && r!=1 && r!=5) || r==3 || c==3){
   //              System.out.print("* ");

   //          }
   //          else{
   //             System.out.print("  ");
   //          }
   //      }
   //      System.out.println();
   //     }
   //  }

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number :");
      int n = sc.nextInt();
      int k = 1;
      sc.close();

      for(int i=1; i<=n; i++)
      { 
         for(int j=1; j<=n; j++){
            if(j>=(n/2+2)-k && j<=(n/2)+k){
               System.out.print("* ");
            }

            else{
               System.out.print("  ");
            }
         }
         if(i<n/2+1){
            k++;
         }
         else{
            k--;
         }
         System.out.println();
      }
   }
   }
    

