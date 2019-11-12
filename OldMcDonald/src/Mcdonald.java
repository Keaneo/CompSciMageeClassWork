import uulib.Console;

public class Mcdonald {
    public static void main(String[] args){
        
        String s = Console.getString("Enter animals (separate by comma)");
        String[] animals = s.split(",");
        
        String b = Console.getString("Enter sounds in the same order as animal (separater by comma)");
        String[] sounds = b.split(",");
        int i = 0;
        while(i < animals.length){
            makeVerses(animals[i], sounds[i]);
            i++;
        }
        
    }
    
    public static void makeVerses(String animal, String sound){
        
        System.out.println("Old McDonald had a farm, E-I-E-I-O");
	System.out.println("And on the farm he had a " + animal + ", E-I-E-I-O");
	System.out.println("With a " + sound + " " + sound +" here and a " + sound + " " + sound +" there");
	System.out.println("Here a " + sound + ", there a " + sound + ", everywhere a " + sound + " " + sound);
	System.out.println("Old McDonald had a farm, E-I-E-I-O");
        System.out.println("");
        
    }
}
