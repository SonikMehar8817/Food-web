// * * * * * 
//   * * *   
//     *     
//   * * *   
// * * * * * 


public class pattern11 {
    public static void main(String[] args) {
         int n = 5;

        for(int r=1; r<=n; r++){
            for(int c=1;c<=n;c++){
                if(c==r || r==1 || r==n || r+c==n+1 || c==3){
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

