import java.util.Arrays;
import java.util.List;

public class Collection2 {
        public static void main(String[] args) {
            List<String> element = Arrays.asList("Highload", "High", "Load", "Highload");
            long collectionElement = element.stream()
                    .filter("High"::equals)
                    .count();
            System.out.println(collectionElement);
        }
}
