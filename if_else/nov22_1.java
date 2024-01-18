package if_else;

public class nov22_1 {
    public static void main(String[] args) {
        int x = 33;
        int y = 45;

        if(x != y)
        {
            System.out.println("frist if");

            

            if(x < y){
                System.out.println("sec if");

                if(x>y)
                {
                    System.out.println("third if");

                }
                else if(y>22){
                    System.out.println("third else");

                    if(x<5){
                        System.out.println("f if ");
                    }
                    else if(x >5)
                    {
                        System.out.println("f else");
                    }
                }

            }
            else if(x>8)
            {
                System.out.println("sec else");
                
            }

        }
    }
}
