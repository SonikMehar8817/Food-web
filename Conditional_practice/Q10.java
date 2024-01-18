package Conditional_practice;

public class Q10 {
    public static void main(String[] args) {
        int x = 1;
        int y = 5;

        if (x<y){
            System.out.println(1);
        }
        if (x%y==0){
            System.out.println(2);
        }

        else if(x>0){
            System.out.println("3");

            if(x==1||y==1){
                System.out.println(4);
            }
            else if (x == y) {
                System.out.println(5);
            }
        }
    }
}
