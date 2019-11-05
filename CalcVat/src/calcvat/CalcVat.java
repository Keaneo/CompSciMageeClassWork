package calcvat;



public class CalcVat { 
    //Variables
    public static double vatPercentage = 0.2;//20%
    public static double price = 67.0;//Pounds
    
    public static void main(String[] args) {
        System.out.println("VAT @ " + vatPercentage * 100 + "% is " + calculateVat() + " pounds and purchase price is " + price + " pounds");//Prints.
    }    
    //Calculates VAT.
    public static double calculateVat()
    {
        return (price * vatPercentage);
    }
}
