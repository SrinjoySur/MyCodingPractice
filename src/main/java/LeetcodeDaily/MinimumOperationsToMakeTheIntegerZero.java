package LeetcodeDaily;

public class MinimumOperationsToMakeTheIntegerZero {
    public int makeTheIntegerZero(int num1, int num2) {
        for (int i = 1; i <= 60; i++) {
            long x = (long) num1 - (long) num2 * i;
            if (x < i) {
                return -1;
            }
            if (i >= Long.bitCount(x)) {
                return i;
            }
        }
        return -1;
    }
}
