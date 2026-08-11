package LeetcodeDaily;

import java.util.HashSet;
import java.util.Set;

public class SmallestMissingIntegerGreaterThanSequentialPrefixSum {
    class Solution {
        public int missingInteger(int[] A) {
            int n = A.length;
            Set<Integer> seen = new HashSet<>(n);

            for (int num : A)
                seen.add(num);
            int sum = A[0];

            for (int i = 1; i < n; i++) {
                if (A[i] == A[i - 1] + 1)
                    sum += A[i];
                else break;
            }

            while (seen.contains(sum))
                sum++;

            return sum;
        }
    }
}
