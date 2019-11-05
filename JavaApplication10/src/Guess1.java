import uulib.Console;
public class Guess1 {
    public static void main(String[] args){
        
        int input = 0;
        int numToGuess = (int) (Math.random() * 100 + 1);
        
        while(input != numToGuess){
           input = Console.getInt("Take a guess"); 
           if(input < numToGuess){
               System.out.println("You guessed too low");
           }
           if(input > numToGuess){
               System.out.println("You guessed too high");
           }
        }
        if(input == numToGuess){
            System.out.println("Congrats, you guessed correctly");
        }
       
        
        
        numToGuess = (int) (Math.random() * 100 + 1);        
    }    
   
}
