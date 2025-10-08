package LeetcodeDaily;

import java.util.ArrayList;
import java.util.Comparator;

public class SortVowelsInAString {
    public String sortVowels(String s) {
        ArrayList<String> str=new ArrayList<>();
        int n=s.length();
        String vowels="aeiouAEIOU";
        for (int i = 0; i < n; i++) {
            if(vowels.contains(String.valueOf(s.charAt(i)))){
                str.add(String.valueOf(s.charAt(i)));
            }
        }
        str.sort(Comparator.naturalOrder());
        int index=0;
        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < n; i++) {
            if (vowels.contains(String.valueOf(s.charAt(i)))) {
                result.setCharAt(i, str.get(index).charAt(0));
                index++;
            }
        }
        s=result.toString();
        return s;
    }
}
