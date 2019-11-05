public class Circle {
    
    public static void main(String[] args){
     
        int radius = 4;
       
        //System.out.println("For a circle of radius " + radius + ", we have a circle of circumference " + CalcCircumference() + " and an area of " + CalcArea());
        System.out.println("Area: " + CalcArea(radius));
        System.out.println("Circumference:" + CalcCircumference(radius));
   }
   
   public static double CalcCircumference(int rad){
       return 3.14 * rad * 2;
   }
   
   public static double CalcArea(int rad){
       double area;
       area = (Math.pow(rad, 2)) * 3.14; //Using ^ is NOT power
       return area;
   }
}
