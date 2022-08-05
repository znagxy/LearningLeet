package main.java.lc.c88;

import java.util.Arrays;

/**
 *给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 *
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 *
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode.cn/leetbook/read/top-interview-questions/xmi2l7/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 输出：[1,2,2,3,5,6]
 * 解释：需要合并 [1,2,3] 和 [2,5,6] 。
 * 合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode.cn/leetbook/read/top-interview-questions/xmi2l7/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Merge {

    public static void main(String[] args) {
        int[] nums1 = new int[]{4,0,0,0,0,0};
        int[] nums2 = new int[]{1,2,3,5,6};
        merge2(nums1,1,nums2,5);

        int[] nums3 = new int[]{0};
        int[] nums4= new int[]{1};
        merge2(nums3,0,nums4,1);

        int[] nums5 = new int[]{1};
        int[] nums6= new int[]{};
        merge2(nums5,1,nums6,0);
    }


    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
       int i = m-1;
       int j = n-1;
       int end = m+n-1;
        while (j >= 0) {
            nums1[end--] = (i >= 0 && nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        }
        System.out.println(Arrays.toString(nums1));
    }


    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m+n];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i<m && j <n){
            if(nums1[i]<=nums2[j]){
                temp[index++] = nums1[i++];
            }else{
                temp[index++] = nums2[j++];
            }
        }
        for(;i<m;){
            temp[index++] = nums1[i++];
        }
        for(;j<n;){
            temp[index++] = nums2[j++];
        }
        System.out.println(Arrays.toString(temp));
    }
}
