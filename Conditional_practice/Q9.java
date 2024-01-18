package Conditional_practice;

public class Q9 {
    
    public static void main(String[] args) {
        int x = 66;
        int y = 77;

        if(x == y){
            System.out.println("1");
        }
        else if (x>y) {
            System.out.println("20");

            if (x!=y){
                System.out.println("4");

                if(y<100){
                    System.out.println("5");
                }
            }
        }
    }
}
