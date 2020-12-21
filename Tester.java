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
    System.out.println();

    System.out.println("Testing random lists with selectionSort");
    for(int i = 0; i<15; i++) {
      int rans = (int) (Math.random()*500);
      Random rngs = new Random(rans);
      int lens = (int)(Math.random()*100);
      int[] xs = new int[lens];
      for(int j = 0; j<lens; j++) {
        xs[j] = rngs.nextInt() % 1000;
      }
      int[] bxs = xs;
      Arrays.sort(xs);
      Sorts.selectionSort(bxs);
      if(Arrays.toString(xs).equals(Arrays.toString(bxs))) {
        System.out.println("PASSED");
      }
      else {
        System.out.println("FAIL");
        System.out.println(rans);
      }
    }
    System.out.println();

    System.out.println("TESTING insertionSort");
    int[] ia = {4,3,2,10,12,1,5,6};
    int[] s = {6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6};
    int[] ir = {1,2,3,4,5};
    int[] fi = {25,24,23,22,21};
    int[] ri = {46,46,55,22,22,990,67,454,236,990,4444,23};
    Sorts.insertionSort(ia);
    System.out.println(Arrays.toString(ia));
    Sorts.insertionSort(d);
    System.out.println(Arrays.toString(d));
    Sorts.insertionSort(s);
    System.out.println(Arrays.toString(s));
    Sorts.insertionSort(fi);
    Sorts.insertionSort(ir);
    Sorts.insertionSort(ri);
    System.out.println(Arrays.toString(fi));
    System.out.println(Arrays.toString(ir));
    System.out.println(Arrays.toString(ri));
    System.out.println();

    System.out.println("Testing random lists with insertionSort");
    for(int i = 0; i<15; i++) {
      int rani = (int) (Math.random()*500);
      Random rngi = new Random(rani);
      int leni = (int)(Math.random()*100);
      int[] xi = new int[leni];
      for(int j = 0; j<leni; j++) {
        xi[j] = rngi.nextInt() % 1000;
      }
      int[] bxi = xi;
      Arrays.sort(xi);
      Sorts.bubbleSort(bxi);
      if(Arrays.toString(xi).equals(Arrays.toString(bxi))) {
        System.out.println("PASSED");
      }
      else {
        System.out.println("FAIL");
        System.out.println(rani);
      }
    }
    System.out.println();
  }
}
