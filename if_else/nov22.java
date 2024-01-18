package if_else;

public class nov22 {
    public static void main(String[] args) {
        int x = 77;
        int y = 44;

        if(x>y){
             System.out.println("first if");

             if(x<=y)
             {
                System.out.println("sec if");
             }
             else if(x!=y)
             {
                System.out.println("sec else");
             }
        }

        else if(x>=y)
        {
            System.out.println("else if");
        }


    }
}
