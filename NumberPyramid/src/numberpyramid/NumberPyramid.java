package numberpyramid;
import java.util.Scanner;
/**
 *
 * @author liamk
 */
public class NumberPyramid 
{
    static int startNum = 9;
    static int i = 1;
    public static void main(String[] args) 
    {
      while(i <= startNum)
      {   
          for(int y = 0; y <= (Math.abs(startNum / 2) - ((i / 2) - 1)); y++)
              {
                  System.out.print(" ");
              }
          for(int x = 1; x <= i; x++)
          {              
              System.out.print(" " + i);
          }
          System.out.print("\n");
          i++;
      }
    }
    
}
