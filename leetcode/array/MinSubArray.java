package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinSubArray {
    /**
     * 给定一个含有 n 个正整数的数组和一个正整数 target 。
     *
     * 找出该数组中满足其和 ≥ target 的长度最小的
     * 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，
     * 并返回其长度。如果不存在符合条件的子数组，返回 0 。
     * @param target
     * @param nums
     * @return 超出时间限制了
     */
    public int minSubArrayLen1(int target, int[] nums) {
        if (nums.length == 0){
            return 0;
        }

        int slow = 0;
        int minResLen = Integer.MAX_VALUE;

        while (slow < nums.length){
            int i = slow;
            int sum = 0;
            while (i < Math.min(slow + minResLen, nums.length)){
                sum += nums[i];
                if (sum >= target){
                    if (minResLen > (i - slow + 1)){
                        minResLen = i - slow + 1;
                    }
                    break;
                }
                i++;
            }
            slow++;
        }

        return minResLen==Integer.MAX_VALUE ? 0 : minResLen;
    }

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int bestLen = Integer.MAX_VALUE;
        while (right < nums.length){
            sum += nums[right];
            while (sum >= target){
                if (right - left + 1 < bestLen){
                    bestLen = right - left + 1;
                }
                sum -= nums[left];
                left++;
            }
            right++;
        }

        return bestLen==Integer.MAX_VALUE ? -1 : bestLen;
    }

    /**
     * 求子数组的最大长度，但是只能包含两种数字
     * @param fruits
     * @return
     */
    public int totalFruit(int[] fruits) {
        int left = 0;
        int right = 0;
        int n = fruits.length;
        Map<Integer, Integer> cntMap = new HashMap<>();
        int res = Integer.MIN_VALUE;
        while (right < n){
            cntMap.put(fruits[right], cntMap.getOrDefault(fruits[right], 0) + 1);
            while (cntMap.size() > 2){
                if (cntMap.get(fruits[left]) == 1){
                    cntMap.remove(fruits[left]);
                }else{
                    cntMap.put(fruits[left], cntMap.get(fruits[left])-1);
                }
                left++;
            }
            res = Math.max(res, right-left+1);
            right++;
        }

        return res==Integer.MIN_VALUE ? 0 : res;
    }
}
