import java.util.Arrays;

public class Tester {
  public static void main(String[] args) {
    int[] a = {5,1,12,-5,16};
    int[] b = {2,3,4,5,1};
    int[] c = {6,1,2,3,4,5};
    Sorts.bubbleSort(a);
    System.out.println(Arrays.toString(a));
    Sorts.bubbleSort(b);
    System.out.println(Arrays.toString(b));
    Sorts.bubbleSort(c);
    System.out.println(Arrays.toString(c));
  }
}
