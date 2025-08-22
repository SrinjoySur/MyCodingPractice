package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IchihimeAndTriangle {
    public int[] Solution(int a,int b,int c,int d){
        int x=a;
        int y=b;
        if(x+y>c){
            return new int[]{x,y,c};
        }
        else{
            int diff=c-(x+y);
            if(x+diff<=y){
                x=x+diff;
                y++;
                return new int[]{x,y,c};
            } else{
                x=y;
                y=(c-(x+y))+y+1;
                if(y>c){
                    return new int[]{0,0,0};
                } else if (x+c>y) {
                    return new int[]{x,y,c};
                } else {
                    c=(y-(x+c))+c+1;
                    if(c>d){
                        return new int[]{0,0,0};
                    } else {
                        return new int[]{x,y,c};
                    }
                }
            }
        }
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
        IchihimeAndTriangle sol=new IchihimeAndTriangle();
        while (T-- > 0) {
            StringBuilder temp = new StringBuilder();
            int a = s.nextInt(), b = s.nextInt(), c = s.nextInt(), d = s.nextInt();
            int[] ans=sol.Solution(a,b,c,d);
            res=temp.append(ans[0]).append(" ").append(ans[1]).append(" ").append(ans[2]);
            System.out.println(res.toString());
        }
    }
}
