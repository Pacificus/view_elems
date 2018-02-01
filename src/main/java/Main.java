import java.util.HashMap;
import java.util.NoSuchElementException;

public class Main {

  public static void main(String[] args) {
  }

  public static int[] solve(int[] array, int target) {
    int[] result = null;
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    for (int i = 0; i < array.length; ++i) {
      int current = array[i];
      int additions = target - current;

      if (hashMap.containsValue(additions)) {
        result = new int[2];
        result[0] = i;

        for (int j:hashMap.keySet()) {
          if (hashMap.get(j) == additions) {
            result[1] = j;
          }
        }
        return result;
      }
      hashMap.put(i, current);
    }

    throw new NullPointerException("null");
  }
}
