package easy;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

class PalindromeTest {
    PalindromeNumber pal;

    @BeforeEach
    void setUp() {
        pal = new PalindromeNumber();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Easy assertion of 1==1")
    void oneIsOne() {
        Assert.assertEquals(1, 1);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Testing a variety of palindromes and non-palindromes")
    void isPalindrome() {
        Assert.assertTrue(pal.isPalindrome(121));
        Assert.assertFalse(pal.isPalindrome(122));
        Assert.assertTrue(pal.isPalindrome(122222221));
        Assert.assertTrue(pal.isPalindrome(1011001101));
        Assert.assertFalse(pal.isPalindrome(1223123));
    }

}