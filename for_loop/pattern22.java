//         1         
//       2 2 2
//     3 3 3 3 3
//   4 4 4 4 4 4 4
// 5 5 5 5 5 5 5 5 5
public class pattern22 {
    public static void main(String[] args) {
        int n=3;
        int a=1;
        for(int r=1; r<=n; r++){
            
            for(int c=1; c<=n*2-1; c++)
            {
                if(c>=(n+1)-r&&c<=(n-1)+r){
                    System.out.print(a +" ");
                    
                }
                else{
                    System.out.print("  ");
                }
            }
            a++;
            
            System.out.println();
        }
    }
}
