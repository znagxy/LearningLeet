package main.java.lc.c240;

/**
 * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：
 *
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode.cn/leetbook/read/top-interview-questions/xmlwi1/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */

public class SearchMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int j = matrix.length-1;
        int i = 0;
        while (j >= 0 && i < matrix[0].length){
            if(target>matrix[j][i]){
                i++;
            }else if(target<matrix[j][i] && j>0){
                j--;
            }else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{new int[]{-1,3}};
        System.out.println(searchMatrix(matrix,3));
    }
}
