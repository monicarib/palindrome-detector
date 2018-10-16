package palindromedetector.palindromedetector;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PalindromeDetectorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private PalindromeDetector palindromeDetector;

    @Before
    public void setUp() throws Exception {
        this.palindromeDetector = new PalindromeDetector();
    }

    @Test
    public void isPalindrome_whenTextIsNotAPalidromeShouldReturnFalse() {
        String text = "Test";
        Assert.assertFalse(this.palindromeDetector.isPalindrome(text));
    }

    @Test
    public void isPalindrome_whenTextIsPalindromeShouldReturnTrue() {
        String text = "0110";
        Assert.assertTrue(this.palindromeDetector.isPalindrome(text));
    }

    @Test
    public void isPalindrome_whenTextIsNullShouldThrowException() {
        thrown.expect(NullPointerException.class);
        thrown.expectMessage("Text is null.");

        this.palindromeDetector.isPalindrome(null);
    }

    @Test
    public void isPalindrome_whenTextIsEmptyShouldThrowException() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Text is empty.");

        this.palindromeDetector.isPalindrome("");
    }
}