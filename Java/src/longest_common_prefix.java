import java.util.Arrays;

public class longest_common_prefix {
        public String longestCommonPrefix(String[] strs) {
            String output = "";

            System.out.println(smallest(strs));
            String smallword = smallest(strs);
            boolean allSimilar = false;

            for (int i = 0; i < smallword.length(); i++) {//this is for the length of the first string in the array
                String curStr = strs[0];
                curStr = String.valueOf(curStr.charAt(i));
                System.out.println("strs is " + strs.length + " long and " + Arrays.toString(strs));
                for(int j = 1; j < strs.length; j++) {//this is for the length of the array
                    String compStr = strs[j];
                    // System.out.println("i is:" + i);
                    compStr = String.valueOf(compStr.charAt(i));
                    System.out.print("curStr is: " + curStr + " and compStr is: " + compStr + "\n");
                    if (curStr.equals(compStr)) {
                        System.out.println("hit true");
                        allSimilar = true;
                    } else {
                        System.out.println("hit false");
                        allSimilar = false;
                        break;
                    }
                }
                if (allSimilar) {
                    output += curStr;
                    System.out.println(output);
                } else if (strs.length == 1) {
                    output = strs[0];
                } else {
                    break;
                }
            } //for loop to iterate over the smallest word

            return output;
        }

        public static String smallest(String words[]) {
            if (words == null || words.length < 1) {
                return "";
            }
            String smallest = words[0];
            for (int i = 1; i < words.length; i++) {
                if (words[i].length() < smallest.length()) {
                    smallest = words[i];
                }
            }
            return smallest;
        }//smallest
}
