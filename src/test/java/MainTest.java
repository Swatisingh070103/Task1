// JUnit 5 test class generated using exact method names from Main.java
// Assumes package-less source (default package), as no package declaration is present in Main.java

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

public class MainTest {

    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;
    private ByteArrayOutputStream outContent;

    @BeforeEach
    void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    /**
     * Test main(String[] args) - positive scenario with valid input.
     * This test simulates user input for normal execution.
     */
    @Test
    void testMain_Positive() {
        String simulatedInput = "5\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        Main.main(new String[]{});
        String output = outContent.toString();
        assertTrue(output.contains("Enter a number:"), "Prompt should be displayed.");
        assertTrue(output.contains("You entered: 5"), "Should echo entered value.");
    }

    /**
     * Test main(String[] args) - edge case: empty input.
     * This test provides empty input and checks for exception or error message.
     */
    @Test
    void testMain_EmptyInput() {
        String simulatedInput = "\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        assertThrows(NumberFormatException.class, () -> Main.main(new String[]{}),
                "Should throw NumberFormatException for empty input.");
    }

    /**
     * Test main(String[] args) - negative scenario: non-integer input.
     * This test provides invalid input and expects a NumberFormatException.
     */
    @Test
    void testMain_NonIntegerInput() {
        String simulatedInput = "abc\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        assertThrows(NumberFormatException.class, () -> Main.main(new String[]{}),
                "Should throw NumberFormatException for non-integer input.");
    }

    /**
     * Test main(String[] args) - edge case: negative number input.
     * Checks handling of negative values.
     */
    @Test
    void testMain_NegativeNumberInput() {
        String simulatedInput = "-7\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        Main.main(new String[]{});
        String output = outContent.toString();
        assertTrue(output.contains("You entered: -7"), "Should handle negative numbers.");
    }

    /**
     * Test main(String[] args) - edge case: large integer input.
     * Checks handling of large integer values.
     */
    @Test
    void testMain_LargeIntegerInput() {
        String simulatedInput = Integer.MAX_VALUE + "\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        Main.main(new String[]{});
        String output = outContent.toString();
        assertTrue(output.contains("You entered: " + Integer.MAX_VALUE), "Should handle large integer input.");
    }
}
