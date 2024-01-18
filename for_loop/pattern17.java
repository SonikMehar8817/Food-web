// *   * * * 
// *   *
// * * * * *
//     *   *
// * * *   *
public class pattern17 {
    public static void main(String[] args) {
        int n=5;
        for(int r=1; r<=n; r++){
            for(int c=1; c<=n; c++){
                if(r==3 || c==3 || (r==1&&c!=2) || (c==1&&r!=4) || (r==n&&c!=4) || (c==n&&r!=2) ){
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
