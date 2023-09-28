import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collection {
    public static void main(String[] args) {
        List<String> element = Arrays.asList("f10", "f15", "f2", "f4", "f4");
        List<String> sortedElement = element.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedElement);
    }
}
