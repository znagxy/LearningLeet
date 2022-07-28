package main.java.lc.easy.array;

/**
 * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 *
 * 请返回 nums 的动态和。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/running-sum-of-1d-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class RunningSum {

    public int[] runningSum(int[] nums) {
        for(int i = 1; i<nums.length;i++){
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }

}
