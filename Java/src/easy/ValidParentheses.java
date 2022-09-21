package easy;
/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'

Runtime: 3 ms, faster than 66.21% of Java online submissions for Valid Parentheses.
Memory Usage: 42.5 MB, less than 16.73% of Java online submissions for Valid Parentheses.

Solution runs until the first right hand bracket is shown, when that happens it hits the default case and begins popping
Stack is a LIFO data structure so the opposite of a queue and so once in the middle should return values going outwards i.e.
test case 4 s={[([{()}])]} | would have a stack of | [}, ], ), ], }, )]
*/

import java.util.Stack;

class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        if(s.length() % 2 == 1)
            return false;

        for (char c: s.toCharArray()) {
            switch(c) {
                case '(':
                    stack.push(')');
                    break;
                case '{':
                    stack.push('}');
                    break;
                case '[':
                    stack.push(']');
                    break;
                default:
                    if (stack.isEmpty() || stack.pop() != c){return false;}
            }
        }
        System.out.println("s=" + s + " | " + stack.isEmpty() + "| " + stack);
        return stack.isEmpty();
    }
}