package main.java.lc.easy.array;

/**
 * 给你一个整数数组 nums ，请计算数组的 中心下标 。
 *
 * 数组 中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。
 *
 * 如果中心下标位于数组最左端，那么左侧数之和视为 0 ，因为在下标的左侧不存在元素。这一点对于中心下标位于数组最右端同样适用。
 *
 * 如果数组有多个中心下标，应该返回 最靠近左边 的那一个。如果数组不存在中心下标，返回 -1 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/find-pivot-index
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class PivotIndex {

    public static void main(String[] args) {
        int[] nums  = new int[] {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int sum = total(nums);
        int left = 0;
        for(int i = 0; i <nums.length ;i++){
            if(left == sum - nums[i]){
                return i;
            }
            left = left + nums[i];
            sum = sum - nums[i];
        }
        return -1;
    }

    private static int total(int[] nums){
        int sum = 0;
        for(int i : nums){
            sum = sum + i;
        }
        return sum;
    }
}
