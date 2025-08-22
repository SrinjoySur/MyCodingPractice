import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
public class SeparateOddAndEven {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1,2,3,4,5,6,7,8,9);
        Map<Boolean,List<Integer>> map= integerList.stream().collect(Collectors.partitioningBy(i -> i%2==0));
        for (Map.Entry<Boolean,List<Integer>> entry:map.entrySet()){
            System.out.println("-----------------------------------");
            if(entry.getKey()){
                System.out.println("Even Numbers:");
            } else {
                System.out.println("Odd Numbers:");
            }
            System.out.println("-----------------------------------");
            for (int i: entry.getValue()) {
                System.out.println(i);
            }
        }
    }
}
