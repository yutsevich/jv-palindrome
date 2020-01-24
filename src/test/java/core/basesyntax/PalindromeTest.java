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
    public void isPalindrome_lettersPalindrome() {
        Palindrome palindrome = new Palindrome();
        boolean actualResult = palindrome.isPalindrome(LETTERS_PALINDROME);
        Assert.assertTrue("Test failed with text " + LETTERS_PALINDROME, actualResult);
    }

    @Test
    public void isPalindrome_lettersAndNumbers() {
        Palindrome palindrome = new Palindrome();
        boolean actualResult = palindrome.isPalindrome(LETTERS_AND_NUMBERS_PALINDROME);
        Assert.assertTrue("Test failed with text " + LETTERS_AND_NUMBERS_PALINDROME,
                actualResult);
    }

    @Test
    public void isPalindrome_lettersAndNumbersNegativeCase() {
        Palindrome palindrome = new Palindrome();
        boolean actualResult = palindrome.isPalindrome(LETTERS_AND_NUMBERS_NON_PALINDROME);
        Assert.assertFalse("Test failed with text " + LETTERS_AND_NUMBERS_NON_PALINDROME +
                "  We shouldn't remove numbers from string", actualResult);
    }

    @Test
    public void isPalindrome_numbers() {
        Palindrome palindrome = new Palindrome();
        boolean actualResult = palindrome.isPalindrome(NUMBERS_PALINDROME);
        Assert.assertTrue("Test failed with text " + NUMBERS_PALINDROME, actualResult);
    }

    @Test
    public void isPalindrome_negativeCaseWithoutNumbers() {
        Palindrome palindrome = new Palindrome();
        boolean actualResult = palindrome.isPalindrome(NON_PALINDROME);
        Assert.assertFalse("Test failed with text " + NON_PALINDROME, actualResult);
    }
}
