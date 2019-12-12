package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {
    private static final String LETTERS_PALINDROME = "Madam, I'm Adam!";
    private static final String LETTERS_AND_NUMBERS_PALINDROME = "1.) level-1";
    private static final String LETTERS_AND_NUMBERS_NON_PALINDROME = ".) level-1";
    private static final String NUMBERS_PALINDROME = "123 43 21";
    private static final String NON_PALINDROME = "Nice day!";


    @Test
    public void isPalindromeWithAllLetters() {
        Palindrome palindrome = new Palindrome();
        boolean actualResult = palindrome.isPalindrome(LETTERS_PALINDROME);
        Assert.assertTrue("Test faid with text " + LETTERS_PALINDROME, actualResult);
    }

    @Test
    public void isPalindromeWithLettersAndNumbers() {
        Palindrome palindrome = new Palindrome();
        boolean actualCorrectResult = palindrome.isPalindrome(LETTERS_AND_NUMBERS_PALINDROME);
        boolean actualInCorrectResult = palindrome.isPalindrome(LETTERS_AND_NUMBERS_NON_PALINDROME);
        Assert.assertTrue("Test faid with text " + LETTERS_AND_NUMBERS_PALINDROME,
                actualCorrectResult);
        Assert.assertFalse("Test faid with text " + LETTERS_AND_NUMBERS_NON_PALINDROME +
                "  We shouldn't remove numbers from string", actualInCorrectResult);
    }

    @Test
    public void isPalindromeWithNumbers() {
        Palindrome palindrome = new Palindrome();
        boolean actualResult = palindrome.isPalindrome(NUMBERS_PALINDROME);
        Assert.assertTrue("Test faid with text " + NUMBERS_PALINDROME, actualResult);
    }

    @Test
    public void isPalindrome() {
        Palindrome palindrome = new Palindrome();
        boolean actualResult = palindrome.isPalindrome(NON_PALINDROME);
        Assert.assertFalse("Test faid with text " + NON_PALINDROME, actualResult);
    }
}
