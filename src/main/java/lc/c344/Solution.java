package main.java.lc.c344;

import java.util.Arrays;

/**
 *编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
 *
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/reverse-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 输入：s = ["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 *
 *
 * 输入：s = ["H","a","n","n","a","h"]
 * 输出：["h","a","n","n","a","H"]
 */

public class Solution {

    public static void main(String[] args) {
        reverseString("abcdteedsf".toCharArray());
    }

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while (left<=right){
            char temp = s[right];
            s[right--] = s[left];
            s[left++] = temp;
        }
        System.out.println(Arrays.toString(s));
    }
}
