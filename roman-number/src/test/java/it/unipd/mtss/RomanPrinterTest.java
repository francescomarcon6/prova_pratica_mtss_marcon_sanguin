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
            "3, ' _____  _____  _____ \n|_   _||_   _||_   _|\n  | |    | |    | |  \n  | |    | |    | |  \n _| |_  _| |_  _| |_ \n|_____||_____||_____|'"
    })
    public void print_ValidInteger_ReturnsAsciiArt(int input, String expectedOutput) {
        // Arrange (I dati sono preparati dal @CsvSource)

        // Act
        String actualOutput = RomanPrinter.print(input);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }
}