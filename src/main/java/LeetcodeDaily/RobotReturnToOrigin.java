package LeetcodeDaily;

public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int cntU=0,cntD=0,cntR=0,cntL=0;
        for(char i: moves.toCharArray()){
            if(i=='U'){
                cntU++;
            } else if(i=='D'){
                cntD++;
            }else if(i=='R'){
                cntR++;
            }else if(i=='L'){
                cntL++;
            }
        }
        if(cntU!=cntD){
            return false;
        } else if(cntL!=cntR){
            return false;
        }
        return true;
    }
}
