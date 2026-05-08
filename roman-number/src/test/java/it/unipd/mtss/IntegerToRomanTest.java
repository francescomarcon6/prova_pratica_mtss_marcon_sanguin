/////////////////////////////////////////////
// FRANCESCO MARCON 2110990
// MARCO SANGUIN 2103121
////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class IntegerToRomanTest {

    @ParameterizedTest
    @CsvSource({
            "1, I",
            "2, II",
            "3, III",
            "4, IV",
            "5, V",
            "6, VI",
            "7, VII",
            "9, IX",
            "10, X",
            "15, XV",
            "19, XIX",
            "20, XX",
            "30, XXX",
            "40, XL",
            "50, L",
            "60, LX",
            "70, LXX",
            "80, LXXX",
            "90, XC",
            "100, C"
    })
    public void convert_ValidInteger_ReturnsRomanString(int input, String expectedOutput) {
        // Arrange (I dati sono preparati dal @CsvSource)

        // Act
        String actualOutput = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }
}

