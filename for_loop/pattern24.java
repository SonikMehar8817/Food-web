// 5 5 5 5 5 5 5 5 5 
//   4 4 4 4 4 4 4
//     3 3 3 3 3
//       2 2 2
//         1
public class pattern24 {
     public static void main(String[] args) {
        int n=5;
        int a=n;
        for(int r=1; r<=n; r++){
            
            for(int c=1; c<=n*2-1; c++)
            {
                if(c>=r&&c<=n*2-r){
                    System.out.print(a +" ");
                    
                }
                else{
                    System.out.print("  ");
                }
            }
            a--;
            
            System.out.println();
        }
    }
}
