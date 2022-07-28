package main.java.lc.easy.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个字符串 s 和 t ，判断它们是否是同构的。
 *
 * 如果s中的字符可以按某种映射关系替换得到t，那么这两个字符串是同构的。
 *
 * 每个出现的字符都应当映射到另一个字符，同时不改变字符的顺序。不同字符不能映射到同一个字符上，相同字符只能映射到同一个字符上，字符可以映射到自己本身。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/isomorphic-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class IsIsomorphic {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo","bar"));
        System.out.println(isIsomorphic("paper","title"));
        System.out.println(isIsomorphic("badc","baba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapS = new HashMap();
        HashMap<Character, Character> mapT = new HashMap();
        if(s.length()!= t.length()) return false;
        for(int i = 0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(!mapS.containsKey(c1)){
                if(mapT.containsKey(c2)){
                    return false;
                }
                mapS.put(c1,c2);
                mapT.put(c2,c1);
            }else{
                if(mapS.get(c1)!=c2 || mapT.get(c2)!=c1){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isIsomorphic2(String s, String t) {
        Map<Character, Character> s2t = new HashMap<Character, Character>();
        Map<Character, Character> t2s = new HashMap<Character, Character>();
        int len = s.length();
        for (int i = 0; i < len; ++i) {
            char x = s.charAt(i), y = t.charAt(i);
            if ((s2t.containsKey(x) && s2t.get(x) != y) || (t2s.containsKey(y) && t2s.get(y) != x)) {
                return false;
            }
            s2t.put(x, y);
            t2s.put(y, x);
        }
        return true;
    }
}
