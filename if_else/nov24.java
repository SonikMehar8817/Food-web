package if_else;

public class nov24 
{
    int h = 89; //globle or class or instant variable becouse it is iside the class (outside the method stck)

    public static void main(String[] args) {
        
        // int f = 89;                    //local variable becouse it is in the method 
        nov24 boj2 = new nov24();
        nov24.a obj1 = boj2.new a();
        nov24.a.b obj3 = obj1.new b();
        System.out.println(boj2.h);
        System.out.println(obj3.B);

        boj2.sonik();
        
    }

    class a
    {
        class b{
             int B = 8;
        }

    }

    int sonik(){
       return 0;
    }
}
