package main.java.lc.c387;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。
 * 输入: s = "leetcode"
 * 输出: 0
 *
 * 输入: s = "loveleetcode"
 * 输出: 2
 *
 * 输入: s = "aabb"
 * 输出: -1
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(firstUniqChar3("leetcode"));
        System.out.println(firstUniqChar3("loveleetcode"));
        System.out.println(firstUniqChar3("aabb"));
        System.out.println(firstUniqChar3("acaadcad"));
    }

    public static int firstUniqChar1(String s) {
        for(int i = 0; i <s.length();i++){
            if(s.length()==1){
                return 0;
            }
            if(s.substring(0,i).indexOf(s.charAt(i)) + s.substring(i+1).indexOf(s.charAt(i))==-2){
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqChar2(String s) {
        Map<Character , Integer> map = new HashMap<>();
        for(int i = 0;i <s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) +1);
        }
        for(int i = 0;i<s.length();i++){
            if(map.get(s.charAt(i))==1) return i;
        }
        return -1;
    }

    public static int firstUniqChar3(String s) {
        for(int i = 0;i <s.length();i++){
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}
