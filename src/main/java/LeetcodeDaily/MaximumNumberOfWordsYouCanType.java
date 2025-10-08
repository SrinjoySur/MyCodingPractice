package LeetcodeDaily;

import java.util.Arrays;
import java.util.List;

public class MaximumNumberOfWordsYouCanType {
    public int canBeTypedWords(String text, String brokenLetters) {
        if(text.isBlank()){
            return 0;
        }
        List<String> letters= Arrays.asList(brokenLetters.split(""));
        int cnt=0;
        String[] words= text.split(" ");
        for (String word :words) {
            for (String i :word.split("")) {
                if(letters.contains(i)){
                    cnt++;
                    break;
                }
            }
        }
        return (words.length)-cnt;
    }
}
