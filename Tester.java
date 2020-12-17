import java.util.Arrays;
import java.util.Random;

public class Tester {
  public static void main(String[] args) {
    System.out.println("TESTING bubbleSort");
    int[] a = {5,1,12,-5,16};
    int[] b = {2,3,4,5,1};
    int[] c = {6,1,2,3,4,5};
    Sorts.bubbleSort(a);
    System.out.println(Arrays.toString(a));
    Sorts.bubbleSort(b);
    System.out.println(Arrays.toString(b));
    Sorts.bubbleSort(c);
    System.out.println(Arrays.toString(c));
    System.out.println();

    System.out.println("Testing misc arrays values");
    int[] d = {};
    Sorts.bubbleSort(d);
    System.out.println(Arrays.toString(d));
    int[] e = {16,17,19,16,30,16,45,30};
    Sorts.bubbleSort(e);
    System.out.println(Arrays.toString(e));
    int[] sorted = {7,8,9,10,11,100};
    int[] reverse = {100,11,10,9,8,7};
    Sorts.bubbleSort(sorted);
    Sorts.bubbleSort(reverse);
    System.out.println(Arrays.toString(sorted));
    System.out.println(Arrays.toString(reverse));
    System.out.println();

    System.out.println("Testing random lists");
    for(int i = 0; i<15; i++) {
      int ran = (int) (Math.random()*500);
      Random rng = new Random(ran);
      int len = (int)(Math.random()*100);
      int[] x = new int[len];
      for(int j = 0; j<len; j++) {
        x[j] = rng.nextInt() % 1000;
      }
      int[] bx = x;
      Arrays.sort(x);
      Sorts.bubbleSort(bx);
      if(Arrays.toString(x).equals(Arrays.toString(bx))) {
        System.out.println("PASSED");
      }
      else {
        System.out.println("FAIL");
        System.out.println(ran);
      }
    }
    System.out.println();

    System.out.println("TESTING selectionSort");
    int[] sa = {64,25,12,22,11};
    int[] sr = {54,54,65,43,43,59,122,34,43};
    int[] sn = {-46,-42,-42,56,32,-13,-44};
    int[] six = {6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6};
    int[] fr = {-2,-1,0,1,2,3,4,5};
    int[] bk = {5,4,3,2,1,0,-1,-2};
    Sorts.selectionSort(sa);
    System.out.println(Arrays.toString(sa));
    Sorts.selectionSort(d);
    System.out.println(Arrays.toString(d));
    Sorts.selectionSort(sr);
    System.out.println(Arrays.toString(sr));
    Sorts.selectionSort(sn);
    System.out.println(Arrays.toString(sn));
    Sorts.selectionSort(six);
    System.out.println(Arrays.toString(six));
    Sorts.selectionSort(fr);
    System.out.println(Arrays.toString(fr));
    Sorts.selectionSort(bk);
    System.out.println(Arrays.toString(bk));

  }
}
