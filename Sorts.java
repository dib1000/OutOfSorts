import java.util.Arrays;
public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    for(int i = data.length-1; i>0; i--) {
      int switches = 0;
      for(int j = 0; j<i; j++) {
        if(data[j]>data[j+1]) {
          switches++;
          int storage = data[j+1];
          data[j+1] = data[j];
          data[j] = storage;
        }
      }
      if(switches==0) {
        break;
      }
    }
  }

  public static void selectionSort(int[] data){
    for(int i = 0; i<data.length; i++) {
      int minimumIndex = i;
      for(int j = i+1; j<data.length; j++) {
        if(data[minimumIndex]>data[j]) {
          minimumIndex = j;
        }
      }
      int storage = data[i];
      data[i] = data[minimumIndex];
      data[minimumIndex] = storage;
    }
  }

  public static void insertionSort(int[] data) {
    for(int i = 1; i<data.length; i++) {
      if(data[i-1]>data[i]) {
        int switches = 0;
        int storage = data[i];
        for(int j = i-1; j>=0; j--) {
          if(data[j]>storage) {
            switches+=1;
            data[j+1] = data[j];
          }
          else {
            break;
          }
        }
        data[i-switches] = storage;
      }
    }
  }
}
