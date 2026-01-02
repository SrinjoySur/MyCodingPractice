package LeetcodeDaily;

import java.util.ArrayList;
import java.util.List;

public class NRepeatedElementInSize2NArray {
    public int repeatedNTimes(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for (int i:nums) {
            if(!list.contains(i)){
                list.add(i);
            } else {
                return i;
            }
        }
        return 0;
    }
}
