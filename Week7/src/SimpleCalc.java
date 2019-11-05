import uulib.Console;

public class SimpleCalc {
    
    public static void main(String[] args){
        
        
        int firstInt = Console.getInt("num1");
        
        while(firstInt != 0){
            
            char operator = Console.getChar("op");
            int secondInt = Console.getInt("num2");
            
            switch(operator){                
                case '+':
                    System.out.println("= " + (firstInt + secondInt));
                    break;
                case '-':
                    System.out.println("= " + (firstInt - secondInt));
                    break;
                case '*':
                    System.out.println("= " + (firstInt * secondInt));
                    break;
                case '/':
                    System.out.println("= " + (firstInt / secondInt));
                    break;
            }
           firstInt = Console.getInt("num1");

        }
        
    }
    
}
