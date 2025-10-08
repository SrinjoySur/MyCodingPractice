package LeetcodeProblems;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        hf(0,0,"",n,ans);
        return ans;
    }
    private void hf(int open,int closed,String s,int n,List<String> res){
        if(open==closed && open+closed==2*n){
            res.add(s);
        }
        if(open<n){
            hf(open+1,closed,s+"(",n,res);
        }
        if(closed<open){
            hf(open,closed+1,s+")",n,res);
        }
    }
}
