/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liam K.
 */

import java.util.Scanner;

public class AvgTemp 
{
    private static double high;
    private static double low;   
    
    
    public static void main(String[] args)
    {
        System.out.println("Welcome!");
        Input();       
        
        System.out.println("The Average Temperature today is " + CalcAvg(high, low) + " degrees");
    }
    
    public static void Input()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Highest Temperature of the day: ");
        
        high = Double.parseDouble(scanner.nextLine());
        
        System.out.print("Enter Lowest Temperature of the day: ");
        
        low = Double.parseDouble(scanner.nextLine());
        
        scanner.close();
    }
    
    public static double CalcAvg(double high, double low)
    {
        double total = high + low;
        return total / 2;
    }
}
