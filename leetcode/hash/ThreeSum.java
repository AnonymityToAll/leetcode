package hash;

import java.util.*;

public class ThreeSum {
    /**
     * 这个会超时
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        Set<Set<Integer>> numSet = new HashSet<>();
        //i j k
        for (int i = 0; i < nums.length; i++) {
            Map<Integer, Integer> numsMap = new HashMap<>();
            for (int j = 0; j < nums.length; j++) {
                if (j != i){
                    numsMap.put(-nums[i]-nums[j], j);
                }
            }
            for (int k = 0; k < nums.length; k++) {
                List<Integer> tempList = new ArrayList<>();
                if (numsMap.containsKey(nums[k])){
                    Integer index = numsMap.get(nums[k]);
                    Set<Integer> tempSet = new HashSet<>();
                    if (index != k && k != i){
                        tempSet.add(nums[i]);
                        tempSet.add(nums[index]);
                        tempSet.add(nums[k]);
                        if (numSet.contains(tempSet)){
                            continue;
                        }else{
                            numSet.add(tempSet);
                        }
                        tempList.add(nums[i]);
                        tempList.add(nums[index]);
                        tempList.add(nums[k]);
                    }
                }
                if (tempList.size() != 0){
                    resList.add(tempList);
                }
            }
        }
        return resList;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        //排序
        Arrays.sort(nums);
        //枚举前两位
        for (int k = 0; k < nums.length; k++) {
            if(nums[k] > 0) break;
            if(k > 0 && nums[k] == nums[k - 1]) continue;
            int i = k + 1;
            int j = nums.length - 1;
            while (i < j){
                int s = nums[k] + nums[i] + nums[j];
                if (s == 0){
                    List<Integer> tempList = new ArrayList<>();
                    tempList.add(nums[k]);
                    tempList.add(nums[i]);
                    tempList.add(nums[j]);
                    resList.add(tempList);
                    i++;
                    while (i<nums.length && nums[i] == nums[i-1]){
                        i++;
                    }
                    j--;
                    while (j>0 && nums[j] == nums[j+1]){
                        j--;
                    }
                }else if(s < 0){
                    i++;
                    while (i<nums.length && nums[i] == nums[i-1]){
                        i++;
                    }
                }else if(s > 0){
                    j--;
                    while (j>0 && nums[j] == nums[j+1]){
                        j--;
                    }
                }
            }
        }
        return resList;
    }
}
