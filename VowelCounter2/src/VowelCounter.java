
import uulib.Console;

public class VowelCounter {

    public static void main(String[] args) {
        int numVowels = 0;
        char input = Console.getChar("Enter character");

        while (input != '.') {

            System.out.println(isVowel(input));
            if (isVowel(input)) {
                numVowels++;
            }
            input = Console.getChar("Enter character");
        }

        if (input == '.') {
            System.out.println(numVowels + " vowels entered");
        }

    }

    public static boolean isVowel(char c) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        boolean vowel = false;
        c = Character.toLowerCase(c);
        int i = 0;
        while (i < vowels.length) {
            
            if (vowels[i] == c) {
                vowel = true;
                break;
            } else {
                i++;
                vowel = false;                
            }
            
        }
        return vowel;
    }

}
