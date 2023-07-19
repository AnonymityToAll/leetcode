import array.BinarySearch;
import array.MinSubArray;
import array.RemoveElements;
import array.SortedPow;

public class Solution {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();//二分查找
        RemoveElements removeElements = new RemoveElements();//移除元素
        SortedPow sortedPow = new SortedPow();//平方排序
        MinSubArray minSubArray = new MinSubArray();//最小子数组长度
        int[] nums = {1,2,3,2,2};
        int i = minSubArray.totalFruit(nums);
        System.out.println(i);
    }
}
