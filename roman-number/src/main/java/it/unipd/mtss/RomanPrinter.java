/////////////////////////////////////////////
// FRANCESCO MARCON 2110990
// MARCO SANGUIN 2103121
////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    // Costanti di classe: spostando l'array qui riduciamo drasticamente
    // la lunghezza del metodo e miglioriamo le performance!
    private static final String[][] ASCII_LETTERS = {
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
            },
            { 
                " _____  ", "|  __ \\ ", "| |  | |", 
                "| |  | |", "| |__| |", "|_____/ " 
            },
            { 
                " __  __ ", "|  \\/  |", "| \\  / |", 
                "| |\\/| |", "| |  | |", "|_|  |_|" 
            }
    };
    
    private static final String LETTERS = "IVXLCDM";

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        StringBuilder asciiArt = new StringBuilder();
        
        for (int row = 0; row < 6; row++) {
            for (char c : romanNumber.toCharArray()) {
                int index = LETTERS.indexOf(c);
                asciiArt.append(ASCII_LETTERS[index][row]);
            }
            if (row < 5) {
                asciiArt.append("\n");
            }
        }
        
        return asciiArt.toString();
    }
}