/////////////////////////////////////////////
// FRANCESCO MARCON 2110990
// MARCO SANGUIN 2103121
////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    
    private static String printAsciiArt(String romanNumber) {
        StringBuilder asciiArt = new StringBuilder();
        
        // Array spezzato su più righe per il limite dei 100 caratteri di Checkstyle
        String[][] asciiLetters = {
                { 
                    " _____ ", "|_   _|", "  | |  ", 
                    "  | |  ", " _| |_ ", "|_____|" 
                },
                { 
                    "__      __", "\\ \\    / /", " \\ \\  / / ", 
                    "  \\ \\/ /  ", "   \\  /   ", "    \\/    " 
                },
                { 
                    "__   __", "\\ \\ / /", " \\ V / ", 
                    "  > <  ", " / . \\ ", "/_/ \\_\\" 
                },
                { 
                    " _      ", "| |     ", "| |     ", 
                    "| |     ", "| |____ ", "|______|" 
                },
                { 
                    "  _____ ", " / ____|", "| |     ", 
                    "| |     ", "| |____ ", " \\_____|" 
                }
        };
        
        String letters = "IVXLC";
        
        for (int row = 0; row < 6; row++) {
            for (char c : romanNumber.toCharArray()) {
                int index = letters.indexOf(c);
                asciiArt.append(asciiLetters[index][row]);
            }
            if (row < 5) {
                asciiArt.append("\n");
            }
        }
        
        return asciiArt.toString();
    }
}