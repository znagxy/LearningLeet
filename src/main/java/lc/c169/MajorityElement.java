package main.java.lc.c169;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 给定一个大小为 n 的数组nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于[ n/2 ]的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * 进阶：尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode.cn/leetbook/read/top-interview-questions/xm77tm/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class MajorityElement {

    public static void main(String[] args) {
        System.out.println(majorityElement1(new int[]{3,2,3}));
    }

    public static int majorityElement1(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();
        if(nums.length==1) return nums[0];
        for (int i : nums){
            if(!map.containsKey(i)){
                map.put(i,1);
            }else{
                int temp = map.get(i)+1;
                if(temp>nums.length/2) return i;
                map.put(i, temp);
            }
        }
        return -1;
    }

    public static int majorityElement2(int[] nums) {
        int major = nums[0];
        int count =1;
        for(int i = 1; i <nums.length;i ++){
            if(count==0){
                count++;
                major=nums[i];
            }else if(major==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return major;
    }
}
