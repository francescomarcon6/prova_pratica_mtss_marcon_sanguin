/////////////////////////////////////////////
// FRANCESCO MARCON 2110990
// MARCO SANGUIN 2103121
////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    
    public static String convert(int number) {
        String[] romanLetters = { "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] values = { 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        StringBuilder romanNumber = new StringBuilder();
        
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                romanNumber.append(romanLetters[i]);
            }
        }
        
        return romanNumber.toString();
    }
}