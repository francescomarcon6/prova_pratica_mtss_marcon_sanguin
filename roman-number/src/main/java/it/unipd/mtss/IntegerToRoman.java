/////////////////////////////////////////////
// FRANCESCO MARCON 2110990
// MARCO SANGUIN 2103121
////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number) {
        String[] romanLetters = { "I" };
        int[] values = { 1 };
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