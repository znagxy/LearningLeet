package main.java.lc.c345;

import java.util.Arrays;
import java.util.List;

/**
 * 给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。
 *
 * 元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现。
 *
 * 输入：s = "hello"
 * 输出："holle"
 *
 * 输入：s = "leetcode"
 * 输出："leotcede"
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        char[] arrayS = s.toCharArray();
        String vowel= "aeiouAEIOU";
        while (left<=right){
            if(vowel.indexOf(arrayS[left])==-1){
                left++;
            }else if(vowel.indexOf(arrayS[right])==-1){
                right--;
            }else{
                char temp = arrayS[right];
                arrayS[right--] = arrayS[left];
                arrayS[left++] = temp;
            }
        }
        return String.valueOf(arrayS);
    }
}
