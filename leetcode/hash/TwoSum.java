package hash;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int numWant = target - nums[i];
            if (indexMap.containsKey(nums[i])){
                return new int[]{indexMap.get(nums[i]), i};
            }else{
                indexMap.put(numWant, i);
            }
        }
        return null;
    }
}
