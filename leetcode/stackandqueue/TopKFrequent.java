package stackandqueue;

import stackandqueue.model.TopK;

import java.util.*;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        Queue<TopK> priorityQueue = new PriorityQueue<>((u,v)->(v.getCount()-u.getCount()));
        Map<Integer, TopK> topKMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (topKMap.containsKey(nums[i])){
                topKMap.get(nums[i]).addCount();
            }else{
                topKMap.put(nums[i], new TopK(nums[i], k));
            }
        }
        for (Map.Entry<Integer, TopK> entry : topKMap.entrySet()) {
            TopK value = entry.getValue();
            priorityQueue.offer(value);
        }
        int[] resArr = new int[k];
        for (int i = 0; i < k; i++) {
            resArr[i] = priorityQueue.poll().getNum();
        }
        return resArr;
    }
}
