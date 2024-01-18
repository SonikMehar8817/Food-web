package Conditional_practice;

public class Q11 {
    
    public static void main(String[] args) {
        int i = 77;
        int j= 44;

        if (i%j==0) {
            System.out.println(1);
        }

        else if (i>j) {
            System.out.println(2);

            if(88>j){
                System.out.println(3);
                if (i>9) {
                    System.out.println(6);
                }
            }

            else if (i ==j ) {
                System.out.println(4);
            }
            if(i<j){
                System.out.println(5);
            }
        }
    }
}
