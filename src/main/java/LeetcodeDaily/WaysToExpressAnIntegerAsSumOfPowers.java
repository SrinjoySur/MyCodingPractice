package LeetcodeDaily;
import java.util.ArrayList;
import java.util.List;

public class WaysToExpressAnIntegerAsSumOfPowers {
    public static void main(String[] args) {
        int n = 160;
        int x = 3;
        System.out.println("Number of ways to express " + n + " as a sum of powers of " + x + ": " + numberOfWays(n, x));
    }

    private static int numberOfWays(int n, int x) {
        int cnt=0;
        List<Integer> numbers=new ArrayList<>();
        for (int i = 1; i < n; i++) {

        }
        return cnt;
    }
}
