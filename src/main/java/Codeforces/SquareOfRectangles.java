package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SquareOfRectangles {
    public static String solution(int l1,int b1,int l2, int b2,int l3,int b3){
        int area=(l1*b1)+(l2*b2)+(l3*b3);
        int s =(int) Math.sqrt(area);
        if(area!=s*s) return "No";
        boolean flag=(b1==b2)&&(b2==b3)&&(b3==s)&&(l1+l2+l3== s);
        if(flag){
            return "Yes";
        } else {
            flag=(l1==l2)&&(l3==l2)&&(l3==s)&&(b1+b2+b3== s);
            if(flag){
                return "Yes";
            } else{
                if(b1==s) {
                    flag = (b2 + b3 == b1);
                    if (flag) {
                        return "Yes";
                    }
                }
                else if (l1==s) {
                    flag = (l2 + l3 == l1);
                    if (flag) {
                        return "Yes";
                    }
                }
            }
        }
        return "No";
    }
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
            int l1 = s.nextInt(), b1 = s.nextInt(), l2 = s.nextInt(), b2 = s.nextInt(), l3= s.nextInt(), b3= s.nextInt();
            res.append(solution(l1,b1,l2,b2,l3,b3).toUpperCase()).append("\n");
        }
        System.out.println(res);
    }
}
