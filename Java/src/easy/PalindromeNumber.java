package easy;
class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String str1 = String.valueOf(x);
        char[] input = new char[str1.length()];
        int counter = 0;
        for (int i = (str1.length() - 1); i >= 0; i--){
            input[counter] = str1.charAt(i);
            counter++;
        }
        String str2 = new String(input);
        if (str1.equals(str2)) {
            System.out.println("TRUE| " + str1 + " is a Palindrome as reversed is: " + str2);
            return true;
        } else {
            System.out.println("FALSE| " + str1 + " reversed is: " + str2);
            return false;
        }
    }
}

