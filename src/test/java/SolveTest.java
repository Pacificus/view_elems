import org.junit.Test;

import java.util.NoSuchElementException;

public class SolveTest {

  @Test
  public void test() {
    int[] array = {1, 2, 2, 8, 9};
    int[] res = null;

    res = Main.solve(array, 9);
    System.out.println(res[0] + " " + res[1]);

    res = Main.solve(array, 4);
    System.out.println(res[0] + " " + res[1]);

    res = Main.solve(array, 8);
    System.out.println(res[0] + " " + res[1]);
  }
}
