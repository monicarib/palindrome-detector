package palindromedetector.palindromedetector;

public class PalindromeDetector {

    public Boolean isPalindrome(String text) {
        this.checkIfTextIsNull(text);

        String textLowerCase = text.toLowerCase();
        return textLowerCase.equals(new StringBuilder(textLowerCase).reverse().toString());
    }

    private void checkIfTextIsNull(String text) {
        if(text == null) {
            throw new NullPointerException("Text is null.");
        }

        if(text.isEmpty()) {
            throw new IllegalArgumentException("Text is empty.");
        }
    }
}