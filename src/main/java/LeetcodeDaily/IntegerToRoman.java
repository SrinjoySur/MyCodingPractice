package LeetcodeDaily;

public class IntegerToRoman {
    public String intToRoman(int num){
        StringBuilder builder=new StringBuilder();
        int n=String.valueOf(num).length();
        for(int i=n;i>=0;i--){
            int digit=(int) Math.pow(10,i);
            int temp=num-num%digit;
            temp/=digit;
            for (int j = temp; j >0 ; j--) {
                if(j==5){
                    builder.append(romanDigit(digit*5));
                    break;
                } else if (j==4) {
                    builder.append(romanDigit(digit));
                    builder.append(romanDigit(digit*5));
                    break;
                } else if (j==9) {
                    builder.append(romanDigit(digit));
                    builder.append(romanDigit(digit*10));
                    break;
                } else{
                    if(j>5){
                        builder.append(romanDigit(digit*5));
                        j-=5;
                    }
                    builder.append(romanDigit(digit));
                }
            }
            num=num%digit;
        }
        return builder.toString();
    }
    public String romanDigit(int n){
        switch (n){
            case 1000 :
                return "M";
            case 500:
                return "D";
            case 100:
                return "C";
            case 50:
                return "L";
            case 10:
                return "X";
            case 5:
                return "V";
            case 1:
                return "I";
            default: return "";
        }
    }
}
