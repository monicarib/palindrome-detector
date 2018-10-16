package palindromedetector.palindromedetector;

public class PalindromeDetector {

    public Boolean isPalindrome(String text) {
        this.checkIfTextIsNull(text);
        return text.equals(new StringBuilder(text).reverse().toString());
    }

    private void checkIfTextIsNull(String text) {
        if(text == null) {
            throw new NullPointerException("Text is null.");
        }
    }
}