package LeetcodeDaily;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for (int i = n-1; i >=0 ; i--) {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            } else{
                if(i==0) {
                    n++;
                    digits=new int[n];
                    digits[0]=1;
                    for (int j = 1; j < n; j++) {
                        digits[j]=0;
                    }
                    return digits;
                } else {
                    digits[i]=0;
                }
            }
        }
        return digits;
    }
}