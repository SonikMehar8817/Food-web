package Conditional_practice;

public class Q2 {
    public static void main(String[] args) {
        int a = 88;
        int b = 34;
        int c = 67;

        if(a>b){
            System.out.println(a);
            if(a>c){
                System.out.println("2 = "+a);
            }
            else if(a<c){
                System.out.println(c);
            }
        }
        else if (b>c){
            System.out.println(b);
            if(b>a){
                System.out.println("2 = "+b);

            }
            else if(b<a){
                System.out.println(a);
            }
        }
        else if (c>b){
            System.out.println(c);
            if(c>a){
                System.out.println(c);
            }
            else if(c<a){
                System.out.println(a);
            }
        }

    }
}
