// * * * * * 
// *       *
// *       *
// *       *
// *       *
// * * * * *


public class pattern7 {
    public static void main(String[] args) {
        int n=6;

    for(int r=1; r<=n; r++)
    {
        for(int c=1; c<=n-1; c++)
        {
            if(r==1 || c==1 || r==n || c==n-1)
            {
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
