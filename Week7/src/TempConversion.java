import uulib.Console;
public class TempConversion{
    
    public static void main(String[] args){       
       
      final double CONVFACTOR = 9.0 / 5.0;   // conversion factor     
      int celsius = 0;
      
      // input celsius  
      while(celsius > -99){
          
      celsius = Console.getInt("Temperature in Celsius (Enter -99 to stop)");
      // calculate fahrenheit
      double fahrenheit = CONVFACTOR * celsius + 32; 

      // print results
      System.out.println(celsius + "C is " + String.format("%.1f",fahrenheit) + "F");
      }
    }
}
    

