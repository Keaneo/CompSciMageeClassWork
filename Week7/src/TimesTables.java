import uulib.Console;
public class TimesTables {
    
    public static void main(String[] args){
        
        int input = 1;
        while(input > 0 && input < 13){
            
            input = Console.getInt("Input a number between 1 and 12");
            if(input <= 0 || input >= 13){
                System.out.println("Number outside range. Stopping...");
                break;
            }
            for(int i = 1; i < 12; i++){
                
                System.out.println(input + " x " + i + " = " + (input * i));
                
            }
        }
        
    }
    
}
