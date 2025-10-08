package LeetcodeDaily;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return new ArrayList<String>(){};
        }
        List<String> strings=new ArrayList<>();
        List<String> str= Arrays.asList(digits.split(""));
        Map<String,List<String>> stringMap=new HashMap<>();
        stringMap.put("2",Arrays.asList("a","b","c"));
        stringMap.put("3",Arrays.asList("d","e","f"));
        stringMap.put("4",Arrays.asList("g","h","i"));
        stringMap.put("5",Arrays.asList("j","k","l"));
        stringMap.put("6",Arrays.asList("m","n","o"));
        stringMap.put("7",Arrays.asList("p","q","r","s"));
        stringMap.put("8",Arrays.asList("t","u","v"));
        stringMap.put("9",Arrays.asList("w","x","y","z"));
        for (String i :str) {
            List<String> temp=stringMap.get(i);
            List<String> tempSol=new ArrayList<>();
            if(strings.isEmpty()){
                tempSol.addAll(temp);
            }
            for (String a:strings) {
                for(String b:temp){
                    tempSol.add(a+b);
                }
            }
            strings=tempSol;
        }
        return strings;
    }

}
