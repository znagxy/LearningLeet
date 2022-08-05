package main.java.lc.c125;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 解释："amanaplanacanalpanama" 是回文串
 *
 * 输入: "race a car"
 * 输出: false
 * 解释："raceacar" 不是回文串
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("raceacar"));
    }

    public static boolean isPalindrome(String s) {
        List list = new ArrayList();
        for(char c: s.toLowerCase().toCharArray()){
            if(Character.isLetterOrDigit(c)){
                list.add(c);
            }
        }
        int size = list.size();
        for(int i =0;i<size/2;i++){
            if(!list.get(i).equals(list.get(size-i-1))){
                return false;
            }
        }
        return true;
    }
}
