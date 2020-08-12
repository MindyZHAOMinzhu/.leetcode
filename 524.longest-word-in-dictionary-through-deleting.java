/*
 * @lc app=leetcode id=524 lang=java
 *
 * [524] Longest Word in Dictionary through Deleting
 */

// @lc code=start
class Solution {
    public String findLongestWord(String s, List<String> d) {
        String longestWord = "";
        for(String target: d){
            int l1 = longestWord.length();
            int l2 = target.length();

            if(l1 > l2 || (l1 == l2 && longestWord.compareTo(target) < 0)){
                continue;
            }// 长度不符合 ---》 一定不是 substr || 长度一样时可以直接用 compareTo 比较 lexicographical order！


            if (ifSubstr(s, target) == true){
                longestWord = target;
            }

        }

        return longestWord;
        
    }

    private boolean ifSubstr(String s, String word){
        int i = 0;
        int j = 0;

        while(i<s.length() && j <word.length()){
            if(s.charAt(i) == word.charAt(j)){
                j++;
            }
                i++;
            
        }

        return j == word.length();
    }
}
// @lc code=end

