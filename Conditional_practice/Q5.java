package Conditional_practice;

public class Q5 {
    public static void main(String[] args) {
        int a = 4;

        if(a!= 0){
            System.out.println("1");

            if(a>10){
                System.out.println("3");
            }
            else if (a == 4) {
                System.out.println("4");
            }
        }
        else if (a>0) {
            System.out.println("2");
        }
    }
}
