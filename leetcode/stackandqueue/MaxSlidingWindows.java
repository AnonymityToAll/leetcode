package stackandqueue;

import stackandqueue.model.SingleQueue;

import java.util.*;

public class MaxSlidingWindows {
    /**
     * 单调队列：向队列中放值x时，看
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        SingleQueue singleQueue = new SingleQueue();
        List<Integer> resList = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            singleQueue.push(nums[i]);
        }
        resList.add(singleQueue.peek());
        for (int i = k; i < nums.length; i++) {
            singleQueue.pop(nums[i-k]);
            singleQueue.push(nums[i]);
            resList.add(singleQueue.peek());
        }

        int[] ans = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            ans[i] = resList.get(i);
        }
        return ans;
    }
}


