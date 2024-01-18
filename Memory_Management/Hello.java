import java.util.Scanner;

public class Hello{
    public static void main(String[] args) {
        int a;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        sc.close();
        System.out.println(a);
    }
}