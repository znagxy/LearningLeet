package main.java.lc.easy.dp;

/**
 * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 *
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 *
 * 进阶：
 *
 * 如果有大量输入的 S，称作 S1, S2, ... , Sk 其中 k >= 10亿，你需要依次检查它们是否为 T 的子序列。在这种情况下，你会怎样改变代码？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/is-subsequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class IsSubsequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
        System.out.println(isSubsequence("ab","baab"));
        System.out.println(isSubsequence("twn","xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxtxxxxxxxxxxxxxxxxxxxxwxxxxxxxxxxxxxxxxxxxxxxxxxn"));
        System.out.println(isSubsequence("aaaaaa","bbaaaa"));
        System.out.println(isSubsequence("bb","ahbgdc"));
        System.out.println("ahbgdc".indexOf("b"));
        System.out.println("ahbgdc".substring(2));
    }


    public static boolean isSubsequence(String s, String t) {
        for(int i = 0; i < s.length();i++){
            int temp = t.indexOf(s.charAt(i));
            if(temp > -1){
                t = t.substring(temp+1);
            }else{
                return false;
            }
        }
        return true;
    }
}
