// 1       
// 3 3
// 5 5 5
// 7 7 7 7
// 5 5 5
// 3 3
// 1
public class pattern25 {
    public static void main(String[] args) {
        int a=1;
        int n=7;
        for(int r=1; r<=n; r++){
            for(int c=1; c<=(n/2)+1; c++){
                 if(c<=r && r<=(n/2)+1){
                    System.out.print(a+" ");
                 }
                 else if(c<=(n+1)-r && r>(n/2)+1){
                    System.out.print(a+" ");
                 }
                 else{
                    System.out.print("  ");
                 }
            }
            if(r<(n/2)+1){
                a++;
                a++;
            }
            else{
                a--;
                a--;
            }
           
            
            System.out.println();
        }
    }
}
