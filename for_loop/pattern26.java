public class pattern26 {
    public static void main(String[] args) {
        
        for(int i=1; i<=5;i++){
            int a=5;
            for(int j=1; j<=5; j++){
                if(j<=i){
                    System.out.print(a+" ");
                    a--;
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
