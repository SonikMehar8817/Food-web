//     *     
//     *     
// * * * * * 
//     *     
//     *     

public class pattern12 {
     public static void main(String[] args) {
        int n = 5;

        for(int r=1; r<=n; r++){
            for(int c=1;c<=n;c++){
                if(c==3 || r==3){
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
