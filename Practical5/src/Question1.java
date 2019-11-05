import java.util.Scanner;
public class Question1 
{
    public static void main(String[] args)
    {   
        System.out.print("Input an integer: ");
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        try{
          input = Integer.parseInt(scanner.next());
          if(input % 3 == 0)
        {
           System.out.println("Multiple of 3!") ;
        }
          else
          {
              System.out.println("Not a multiple of 3!");
          }
        }
        catch(Exception e)
        {
            System.out.println("Not an integer!");
        }      
    }
}
