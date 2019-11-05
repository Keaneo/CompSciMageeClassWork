
public class NewClass{
    public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double moneyGiven = 0;
        double price = 0;
        
        
        try{
        System.out.print("Enter price: ");
        price = Double.parseDouble(scanner.next());
        }
        catch(Exception e)
        {
            System.out.println("Not a valid amount");
        }
        
        try{
        System.out.print("Enter tender: ");
        moneyGiven = Double.parseDouble(scanner.next());
        }
        catch(Exception e)
        {
            System.out.println("Not a valid amount");
        }

        
        if(moneyGiven > price){
            String change = String.format("%.2f", (moneyGiven - price));
            System.out.println("Your change is £" + change);
        }
        else if (moneyGiven == price)
        {
            System.out.println("No change due");
        }       
        else{
           String change = String.format("%.2f", (price - moneyGiven));
           System.out.println("A further £" + change + " is required");
        }
        
            
        
        
        
        
    }
}
