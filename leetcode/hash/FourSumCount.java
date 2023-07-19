package hash;

import java.util.HashMap;
import java.util.Map;

public class FourSumCount {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int resNum = 0;
        //获取Map key:0-nums1[i]-nums2[i] value:个数
        Map<Integer, Integer> nums12Map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums12Map.containsKey(0-nums1[i]-nums2[j])){
                    nums12Map.put(0-nums1[i]-nums2[j], nums12Map.get(0-nums1[i]-nums2[j])+1);
                }else{
                    nums12Map.put(0-nums1[i]-nums2[j], 1);
                }
            }
        }
        //遍历循环看nums3 nums4有没有满足的
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int sum34 = nums3[i] + nums4[j];
                resNum += nums12Map.getOrDefault(sum34, 0);
            }
        }

        return resNum;
    }
}
