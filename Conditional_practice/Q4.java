package Conditional_practice;

public class Q4 {
    public static void main(String[] args) {
        int a = 8;
        int b = 55;
        int c = 22;

        if(c<a){
            System.out.println("1");

            if(a == b){
                System.out.println("2");
            }
            else if(a!=b){
                System.out.println("3");
            }
        }

        if(b>c){

            if(b!=0){
                System.out.println("4");

                if(c>b){
                    System.out.println("6");
                }
            }
            else if (b==0){
                System.out.println("5");
            }
            
        }
    }

    
}
