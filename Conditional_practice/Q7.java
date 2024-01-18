package Conditional_practice;

public class Q7 {
    
    public static void main(String[] args) {
        int x = 11;
    int y = 33;

        if (x>y) {
            System.out.println("1");   
        }

        else if (x<y) {
            System.out.println("2");

            if (x!=y) {
                System.out.println(3);
            }
            if (y!=8) {
                System.out.println(4);
            }
        }
    }

    
}
