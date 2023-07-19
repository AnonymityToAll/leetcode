package array;

import java.util.HashSet;
import java.util.Set;

public class RemoveElements {
    /**
     * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
     *
     * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        int fast = 0;
        while (slow < nums.length && fast < nums.length){
            if (nums[fast] == val){
                fast++;
            }else{
                nums[slow] = nums[fast];
                fast++;
                slow++;
            }
        }
        return slow;
    }

    /**
     * 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，
     * 使每个元素 只出现一次 ，返回删除后数组的新长度。
     * 元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        //跟删除一个元素一样，只不过只在第一次出现的赋值
        int slow = 0;
        int fast = 0;
        Set<Integer> distinctSet = new HashSet<>();
        while (slow < nums.length && fast < nums.length){

            if (fast != 0 && nums[fast] == nums[fast - 1]){
                fast++;
            }else{
                nums[slow] = nums[fast];
                slow++;
                fast++;
            }
        }
        return slow;
    }

    /**
     * 给定一个数组 nums，编写一个函数将所有 0
     * 移动到数组的末尾，同时保持非零元素的相对顺序。
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int i = removeElement(nums, 0);
        while (i < nums.length){
            nums[i] = 0;
            i++;
        }
    }
}
