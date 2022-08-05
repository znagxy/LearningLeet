package main.java.lc.c131;

import java.util.List;

/**
 *
 * 给你一个字符串 s，请你将 s 分割成一些子串，使每个子串都是 回文串 。返回 s 所有可能的分割方案。
 *
 * 回文串 是正着读和反着读都一样的字符串。
 *
 * 输入：s = "aab"
 * 输出：[["a","a","b"],["aa","b"]]
 *
 * 输入：s = "a"
 * 输出：[["a"]]
 */
public class Solution {

    public List<List<String>> partition(String s) {
        return null;
    }

    private boolean isPalindrome(String s, int left , int right){
        while(left<right && s.charAt(left) == s.charAt(right)){
            left++;
            right--;
        }
        return left>=right;
    }

}
