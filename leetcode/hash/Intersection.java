package hash;

import java.util.*;

public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> distinctSet = new HashSet<>();
        Set<Integer> resSet = new HashSet<>();
        for (int i : nums1) {
            distinctSet.add(i);
        }
        for (int i : nums2) {
            if (distinctSet.contains(i)){
                resSet.add(i);
            }
        }
        Iterator<Integer> iterator = resSet.iterator();
        int[] resArr = new int[resSet.size()];
        int i = 0;
        while (iterator.hasNext()){
            Integer next = iterator.next();
            resArr[i] = next;
            i++;
        }
        return resArr;
    }
}
