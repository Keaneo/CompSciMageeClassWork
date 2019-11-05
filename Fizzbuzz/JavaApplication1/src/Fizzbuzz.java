/*
*   
*   
*/

/**
 *
 * @author liamk
 */
import java.lang.Double;

public class Fizzbuzz 
{
    static int i = 1;
    
    public static void main(String[] args)
    {
        while(i <= 100)
        {
            String prINT = i % 3 == 0 ? "Fizz" : Integer.toString(i);
            prINT = i % 5 == 0 ? "Buzz" : prINT;
            prINT = i % 3 == 0 && i % 5 == 0 ? "FizzBuzz" : prINT;
            System.out.println(prINT);
            i++;
        }   
    }
}
