public class Swap3 {
    
    
    public static void main(String[] args){
        int a1 = 7;
        int a2 = 9;
        int a3 = 13;
        
        System.out.println("a1: " + a1 + "\na2: " + a2 + "\na3: " + a3);
        
        int temp = a1;       
        
        a1 = a3;
        a3 = a2;
        a2 = temp;
        
        System.out.println("\na1: " + a1 + "\na2: " + a2 + "\na3: " + a3);
        
        
        
    }
}
