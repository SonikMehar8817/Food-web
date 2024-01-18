//     * 
//    * *
//   * * *
//  * * * *
// * * * * * 
public class pattern15 {
     public static void main(String[] args) {

        for(int r=1; r<=5; r++){
            boolean k = true;
            for(int c=1; c<=5; c++){
                if(c>=6-r&&c<=r+4 && k){
                    
                        System.out.print("* ");
                       
                }
                else
                {
                    System.out.print(" ");
                    k = true;
                }
            }
            System.out.println();
        }
    }
}
