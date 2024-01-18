package Conditional_practice;

public class Q6 {
    
    public static void main(String[] args) {
        int a = 8;
        int b = 10;

    if(a>b){
        System.out.println("1");
    }
    else if (a<b) {
        System.out.println("2");
        if(a>b){
            System.out.println("3");
        }
    }
    }
}
