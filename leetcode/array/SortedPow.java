package array;

import java.util.*;

public class SortedPow {
    /**
     * 给你一个按 非递减顺序 排序的整数数组 nums，
     * 返回 每个数字的平方 组成的新数组，
     * 要求也按 非递减顺序 排序。
     * @param nums
     * @return
     */
    public int[] sortedSquares(int[] nums) {
        int[] intArr = new int[nums.length];
        if (nums.length == 0){
            return intArr ;
        }
        int begin = 0;
        int end = nums.length - 1;
        int i = nums.length - 1;

        while (begin <= end){
            if (nums[begin] * nums[begin] < nums[end] * nums[end]){
                intArr[i] = nums[end] * nums[end];
                end--;
            }else{
                intArr[i] = nums[begin] * nums[begin];
                begin++;
            }
            i--;
        }

        return intArr;
    }
}
