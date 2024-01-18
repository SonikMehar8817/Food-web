package Classes_Object;

public class nov27 {
    public static void main(String[] args) {
        a d = new a();
        d.i();
        b();
        a.b();

        
    }
    static int b(){
            int h=1;
            System.out.println(h);
            return 4;
    }
    
}

class a{

    static int b(){
        int c=7;
        System.out.println(c);
        return 9;
    }

    int i(){
        System.out.println("11");
        return 0;
    }
}
