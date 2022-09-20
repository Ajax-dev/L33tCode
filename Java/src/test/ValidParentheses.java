import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;
import ValidParentheses;

class ValidParenthesesTest {
    ValidParentheses v;

    @BeforeEach
    void setUp() {
        uni = new ValidParentheses();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Easy assertion of 1==1")
    void oneIsOne() {
        Assert.assertEquals(1, 1);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("leetcode returns true for '()'")
    void test1() { Assert.assertEquals(0, v.isValid("()"));}

    @org.junit.jupiter.api.Test
    @DisplayName("leetcode returns true for '()[]'")
    void test2() { Assert.assertEquals(0, v.isValid("()[]"));}

    @org.junit.jupiter.api.Test
    @DisplayName("leetcode returns true for '()[]{}'")
    void test3() { Assert.assertEquals(0, v.isValid("()[]{}"));}

    @org.junit.jupiter.api.Test
    @DisplayName("leetcode returns true for '{[([{()}])]}'")
    void test4() { Assert.assertEquals(0, v.isValid("{[([{()}])]}"));}

    @org.junit.jupiter.api.Test
    @DisplayName("leetcode returns false for '()[]{}('")
    void test5() { Assert.assertEquals(0, v.isValid("()[]{}("));}

    @org.junit.jupiter.api.Test
    @DisplayName("leetcode returns false for '([{)]}'")
    void test6() { Assert.assertEquals(0, v.isValid("([{)]}"));}

    @org.junit.jupiter.api.Test
    @DisplayName("leetcode returns false for '(((())])'")
    void test7() { Assert.assertEquals(0, v.isValid("(((())])"));}

}