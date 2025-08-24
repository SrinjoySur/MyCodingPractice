package Leetcode;

public class Main{
    public static void main(String[] args) {
//        LetterCombinationsOfAPhoneNumber sol=new LetterCombinationsOfAPhoneNumber();
//        System.out.println(sol.letterCombinations("23"));
//        System.out.println(sol.letterCombinations(""));
//        System.out.println(sol.letterCombinations("2"));
//        FourSum fourSum=new FourSum();
//        System.out.println(fourSum.fourSum(new int[]{1,0,-1,0,-2,2},0));
//        System.out.println(fourSum.fourSum(new int[]{2,2,2,2,2},8));
//            FindTheMinimumAreaToCoverAllOnes sol=new FindTheMinimumAreaToCoverAllOnes();
//            System.out.println(sol.minimumArea(new int[][]{{0,1,0},{1,0,1}}));
//            System.out.println(sol.minimumArea(new int[][]{{1,0},{0,0}}));
        LongestSubarrayOfOnesAfterDeletingOneElement sol=new LongestSubarrayOfOnesAfterDeletingOneElement();
        System.out.println(sol.longestSubarray(new int[]{1,1,0,1}));
        System.out.println(sol.longestSubarray(new int[]{0,1,1,1,0,1,1,0,1}));
        System.out.println(sol.longestSubarray(new int[]{1,1,1}));
    }
}
