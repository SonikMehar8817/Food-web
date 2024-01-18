package Conditional_practice;

public class Q8 {
    public static void main(String[] args) {
        int x = 8;
        int y = 8;

        if (x==y)
        {
            System.out.println("1");
        }
        if (x>=y) {
            System.out.println("2");
        }
        else if(x<=y){
            System.out.println("3");
        }
        if (x%y==0) {
            System.out.println("4");

            if (y>x) {
                System.out.println("5");
            }
            else if (y>0) {
                System.out.println("6");
            }
        }
    }
}
