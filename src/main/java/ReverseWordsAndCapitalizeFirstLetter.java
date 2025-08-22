import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWordsAndCapitalizeFirstLetter {
    public static void main(String[] args) {
        String str="rac sub but";
        String result=Arrays.stream(str.split(" "))
                .map(i->new StringBuilder(i).reverse())
                .map(i->{return i.substring(0,1).toUpperCase()+i.substring(1,i.length());})
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
