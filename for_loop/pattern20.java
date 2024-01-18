// A B C D E D C B A 
// A B C D   D C B A
// A B C       C B A
// A B           B A
// A               A
public class pattern20 {
     public static void main(String[] args) {
        
        for(int r=1; r<=5; r++)
        {
            char a = 'A';
            for(int c=1; c<=9; c++)
            {
                if(c<=6-r||c>=r+4){
                    System.out.print(a);
                    System.out.print(" ");
                    if (c<5) {
                        a++;
                    }
                    else{
                        a--;
                    }
                }
                else{
                    System.out.print("  ");
                    if(c-r==3)
                    {
                        a--;
                    }
                }
            }
            System.out.println();

        }
    }
}
