package LeetcodeDaily;

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        if(gain.length==0) {
            return 0;
        } else if (gain.length==1) {
            if (gain[0]<1){
                return 0;
            } else {
                return gain[0];
            }
        }
        int highest=0;
        int curr=0;
        for(int i:gain){
            curr+=i;
            if(curr>highest){
                highest=curr;
            }
        }
        return highest;
    }
}
