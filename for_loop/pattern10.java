// *         
// * *
// *   *
// *     *
// * * * * *

public class pattern10 {
    public static void main(String[] args) {
        int n = 5;

        for(int r=1; r<=n; r++){
            for(int c=1;c<=n;c++){
                if(c==r || c==1 || r==n){
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
