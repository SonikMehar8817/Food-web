package Conditional_practice;

public class Q12 {
    public static void main(String[] args) {
        int a=40;
	    int b=6;
	    int c=5;
	
	if((a>b)&&(a>c)){
		
		System.out.println("a is greater :");
	
		}
		else {
			if((b>a)&&(b>c)){
				System.out.println("b is greater :");
				
			}
            else if((c>a)&&(c>b)){
				System.out.println("c is greater :");
			}
		}
    }
}
