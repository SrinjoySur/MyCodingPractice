package LeetcodeDaily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindResultantArrayAfterRemovingAnagrams {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        ans.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            char[] a = words[i].toCharArray(), b = ans.get(ans.size() - 1).toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if (!Arrays.equals(a, b))
                ans.add(words[i]);
        }
        return ans;
    }
}
