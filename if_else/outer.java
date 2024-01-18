package if_else;

public class outer {

    int x;
    public static void main(String[] args) {
        outer b = new outer();
        System.out.println(b.x);
        outer1 c=new outer1();
        c.y = 70;
        System.out.println(c.y);
        outer3 d = new outer3();
        d.xyz();

        
        outer3 .ct m = d.new ct();
        System.out.println(m.k);
        
    }
}

class outer1
{
   int y;

}

class outer3{
    void xyz(){
        System.out.println("hi");
    }
    //inner class
    class ct
    {
        int k = 90;
    }
}