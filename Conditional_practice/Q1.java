package Conditional_practice;

public class Q1 {
    
    public static void main(String[] args) {
        int a = 8;
        int b = 7;

        if(a<b){
            System.out.println("1");
            if(a <9){
                System.out.println("3");
            }
            else if(b>a){
                System.out.println("4");
            }
        }
        else if(a!=b){
            System.out.println("2");
        }
    }
}
