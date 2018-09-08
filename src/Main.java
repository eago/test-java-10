import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

      List<Integer> initialList = Arrays.asList(1, 2, 3, 4);
      List<Integer> copyList = List.copyOf(initialList); // unmodifiable
//      copyList.add(4); // UnsupportedOperationException runtime

      List<Integer> eventList = initialList.stream()
              .filter(e -> e % 2 == 0)
              .collect(Collectors.toUnmodifiableList());
//      eventList.add(4); // UnsupportedOperationException

      Integer firstEven = initialList.stream()
              .filter(i -> i % 2 == 0)
              .findFirst()
              .orElseThrow();
//      System.out.println(firstEven);

      // type inference of local variables with initializer

      String message9 = "Goodbye, Java 9";
      System.out.println(message9.getClass());

      var message10 = "Hello, Java 10";
      System.out.println(message10.getClass());

      var idToNameMap = new HashMap<Integer, String>();

    }
}
