import java.util.*;
import java.util.stream.*;

public class Listing7 {

  public static Stream<Integer> generateParallelStream() {
    final int elements = 1000;
    List<Integer> toReturn = new ArrayList(elements);
    for (int i = 0; i < elements; i++) {
      toReturn.add(i);
    }
    return toReturn.parallelStream();
  }

  public static void main(String[] args) {
    // Perform the stream processing
    List<Object> list = Arrays.asList(generateParallelStream().toArray());
  }

}
