import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUniqueCharacter {

    public static void main(String[] args) {
        String string="HHeello  World";
        Arrays
                .stream(string.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i->i.getValue()==1)
                .findFirst()
                .ifPresent(i-> System.out.println(i.getKey()));
    }
}
