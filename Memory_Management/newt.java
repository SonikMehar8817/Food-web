public class newt {
    int age;
    String name;
    String clgname;
    newt(int x,String y,String z)
    {
        age = x;
        name = y;
        clgname = z;
    }
    public static void main(String[] args) {
        
        newt rishi = new newt(22,"sonik","sirt");
    
        //System.out.println(sanjana.age);
        //System.out.println(sanjana.name);
        //System.out.println(sanjana.clgname);
        System.out.println(rishi.age);
        System.out.println(rishi.name);
        System.out.println(rishi.clgname);

    }
}
