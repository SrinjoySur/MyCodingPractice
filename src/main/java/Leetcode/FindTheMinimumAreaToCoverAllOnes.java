package Leetcode;

import java.util.Map;

public class FindTheMinimumAreaToCoverAllOnes {
    public int minimumArea(int[][] grid) {
        if(grid.length==0){
            return 0;
        }
        int n=grid.length;
        int m= grid[0].length;
        int area=0;
        int minRow=n,maxRow=1,minCol=m,maxCol=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j]==1){
                    minRow=Math.min(minRow,i+1);
                    minCol=Math.min(minCol,j+1);
                    maxRow=Math.max(maxRow,i+1);
                    maxCol=Math.max(maxCol,j+1);
                }
            }
        }
        area=(maxRow-minRow+1)*(maxCol-minCol+1);
        return area;
    }
}
