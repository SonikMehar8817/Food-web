// 1       
// 3 3
// 5 5 5
// 7 7 7 7
public class pattern23 {
    public static void main(String[] args) {
        int n=4 ;
        int a=1;

        for(int r=1; r<=n; r++){
            for(int c=1; c<=n; c++){
                if(c<=r){
                    System.out.print(a+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            a++;
            a++;
            System.out.println();
        }
    }
}
