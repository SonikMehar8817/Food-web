package if_else;

import if_else.first.sec.third;
import if_else.first.sec.third.forth;
import if_else.first.sec.third.forth.fifth;
import if_else.first.sec.third.forth.fifth.sixth;

public class practice {
      
    public static void main(String[] args) {
        first obj1 = new first();
        System.out.println(obj1.x);

        first.sec obj2 = obj1.new sec();
        System.out.println(obj2.y);

        third obj3 = obj2.new third();
        System.out.println(obj3.z);

        forth obj4 = obj3.new forth();
        System.out.println(obj4.a);

        fifth obj5 = obj4.new fifth();
        System.out.println(obj5.b);
        obj5.i();

        sixth obj6 = obj5.new sixth();
        System.out.println(obj6.c);
    }

}

class first{
    int x = 1;

    class sec{
        int y = 2;

        class third{
            int z = 3;

            class forth{
                int a = 4;

                class fifth{
                    int b = 5;
                    int i(){
                        System.out.println("this is my fifth class");
                        return 0;
                    }
                  
                    class sixth{
                        
                        int c = 8;
                    }
                    
                }
            }
        }
    }
}