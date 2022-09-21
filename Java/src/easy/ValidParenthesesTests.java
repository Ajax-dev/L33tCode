package easy;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;



class ValidParenthesesTests {
    ValidParentheses v;

    @BeforeEach
    void setUp() {
        v = new ValidParentheses();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Easy assertion of 1==1")
    void oneIsOne() {
        Assert.assertEquals(1, 1);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("leetcode returns true for '()'")
    void test1() { Assert.assertEquals(true, v.isValid("()"));}

    @org.junit.jupiter.api.Test
    @DisplayName("leetcode returns true for '()[]'")
    void test2() { Assert.assertEquals(true, v.isValid("()[]"));}

    @org.junit.jupiter.api.Test
    @DisplayName("leetcode returns true for '()[]{}'")
    void test3() { Assert.assertEquals(true, v.isValid("()[]{}"));}

    @org.junit.jupiter.api.Test
    @DisplayName("leetcode returns true for '{[([{()}])]}'")
    void test4() { Assert.assertEquals(true, v.isValid("{[([{()}])]}"));}

    @org.junit.jupiter.api.Test
    @DisplayName("leetcode returns false for '()[]{}('")
    void test5() { Assert.assertEquals(false, v.isValid("()[]{}("));}

    @org.junit.jupiter.api.Test
    @DisplayName("leetcode returns false for '([{)]}'")
    void test6() { Assert.assertEquals(false, v.isValid("([{)]}"));}

    @org.junit.jupiter.api.Test
    @DisplayName("leetcode returns false for '(((())])'")
    void test7() { Assert.assertEquals(false, v.isValid("(((())])"));}

}