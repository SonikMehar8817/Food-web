// * * * * * * * 
//   * * * * *
//     * * *
//       *


public class pattern6 {
    public static void main(String[] args) {
        
        for(int r = 1; r<=5; r++)
        {
            for(int c=1; c<=7; c++)
            {
                if(r<=c && c<=8-r)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
