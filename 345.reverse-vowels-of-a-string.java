import java.util.HashSet;

/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

// @lc code=start
class Solution {
    private final static HashSet<Character> vowels = new HashSet<>(
        Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public String reverseVowels(String s) {
        if(s == null){
            return null;
        }


        int i = 0;
        int j = s.length() - 1;

        char[] str_ls = new char[s.length()];

        while(i <= j){
            char cha_i = s.charAt(i);
            char cha_j = s.charAt(j);

            if(!vowels.contains(cha_i)){
                str_ls[i++] = cha_i;
            }else if(!vowels.contains(cha_j)){
                str_ls[j--] = cha_j;
            }else{
                str_ls[i++] = cha_j;
                str_ls[j--] = cha_i;
            }


        }
        return new String(str_ls);
    }
}
// @lc code=end

