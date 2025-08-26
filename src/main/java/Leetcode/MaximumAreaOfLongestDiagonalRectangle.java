package Leetcode;

public class MaximumAreaOfLongestDiagonalRectangle {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double longestDiagonal=Double.MIN_VALUE;
        int maxArea=Integer.MIN_VALUE;
        for (int[] dimension : dimensions) {
            double diagonal = Math.sqrt(Math.pow(dimension[0], 2) + Math.pow(dimension[1], 2));
            if (longestDiagonal < diagonal) {
                longestDiagonal = diagonal;
                int area = dimension[0] * dimension[1];
                maxArea=area;
                System.out.println(longestDiagonal+" "+area);
            } else if (longestDiagonal==diagonal){
                int area = dimension[0] * dimension[1];
                if(area>maxArea){
                    maxArea=area;
                    System.out.println(longestDiagonal+" "+area);
                }
            }
        }
        return maxArea;
    }
}
