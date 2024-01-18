// * * * * * * * * * 
// * * * *   * * * *
// * * *       * * *
// * *           * *
// *               *

public class pattern16 {
    public static void main(String[] args) {
        
        for(int r=1; r<=5; r++)
        {
            for(int c=1; c<=9; c++)
            {
                if(c<=6-r||c>=r+4){
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
