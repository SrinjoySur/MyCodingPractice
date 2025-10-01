package Leetcode;

public class WaterBottles {
    public int numWaterBottles(int b, int n) {
        return b + (b - 1) / (n - 1);
    }
}
