/////////////////////////////////////////////
// FRANCESCO MARCON 2110990
// MARCO SANGUIN 2103121
////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RomanPrinterTest {

    @ParameterizedTest
    @CsvSource({
            "1, ' _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|'",
            "2, ' _____  _____ \n|_   _||_   _|\n  | |    | |  \n  | |    | |  \n _| |_  _| |_ \n|_____||_____|'",
            "3, ' _____  _____  _____ \n|_   _||_   _||_   _|\n  | |    | |    | |  \n  | |    | |    | |  \n _| |_  _| |_  _| |_ \n|_____||_____||_____|'",
            "4, ' _____ __      __\n|_   _|\\ \\    / /\n  | |   \\ \\  / / \n  | |    \\ \\/ /  \n _| |_    \\  /   \n|_____|    \\/    '",
            "5, '__      __\n\\ \\    / /\n \\ \\  / / \n  \\ \\/ /  \n   \\  /   \n    \\/    '",
            "6, '__      __ _____ \n\\ \\    / /|_   _|\n \\ \\  / /   | |  \n  \\ \\/ /    | |  \n   \\  /    _| |_ \n    \\/    |_____|'",
            "7, '__      __ _____  _____ \n\\ \\    / /|_   _||_   _|\n \\ \\  / /   | |    | |  \n  \\ \\/ /    | |    | |  \n   \\  /    _| |_  _| |_ \n    \\/    |_____||_____|'",
            "9, ' _____ __   __\n|_   _|\\ \\ / /\n  | |   \\ V / \n  | |    > <  \n _| |_  / . \\ \n|_____|/_/ \\_\\'",
            "10, '__   __\n\\ \\ / /\n \\ V / \n  > <  \n / . \\ \n/_/ \\_\\'"
    })
    public void print_ValidInteger_ReturnsAsciiArt(int input, String expectedOutput) {
        // Arrange (I dati sono preparati dal @CsvSource)

        // Act
        String actualOutput = RomanPrinter.print(input);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }
}