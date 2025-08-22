package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader s = new FastReader();
        int T = s.nextInt();
        StringBuilder res = new StringBuilder();
        while (T-- > 0) {
            StringBuilder temp = new StringBuilder();
            int l1 = s.nextInt(), b1 = s.nextInt(), l2 = s.nextInt(), b2 = s.nextInt(), l3= s.nextInt(), b3= s.nextInt();
            res.append(SquareOfRectangles.solution(l1,b1,l2,b2,l3,b3)).append("\n");
        }
        System.out.println(res);
    }
}
