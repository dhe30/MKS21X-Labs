import java.util.Arrays;
public class Sorts{

  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int length = data.length;
    boolean sorted = false;
    while (!sorted){
      boolean switched = false;
      for (int a = 0; a < (length - 1); a++){
        if (data[a] > data[a + 1]){
          int h = data[a];
          data[a] = data[a + 1];
          data[a + 1] = h;
          switched = true;
        }
      }
      if (!switched){
        sorted = true;
      }
      length--;
    }
  }
  /*Selection sort
 */
  public static void selectionSort(int [] ary) {
    /*Your implementation here!*/

    for(int start = 0; start < ary.length; start++){
      int min = start;
      for (int i = start; i < ary.length; i++){
        if (ary[i] < ary[min]){
          min = i;
        }
      }
      int hold = ary[start];
      ary[start] = ary[min];
      ary[min] = hold;
    }
  }
  public static void insertionSort(int[]data){ /*Your implementation here*/
    for(int i = 1; i < data.length; i++){
      System.out.println(Arrays.toString(data));
      if (data[i] < data[i - 1]){
        int hold = 0;
        for (int a = i - 1; a <= 0; a--){
          System.out.println(data[i] + " greater than "+data[a]);
          if (data[i] < data[a]){
            hold = a;
          }
        }
        int valueHold = data[hold];
        data[hold] = data[i];
        for (int b = i; b > hold + 1; b--){
          data[b] = data[b - 1];
        }
        data[hold + 1] = valueHold;
      }
    }
  }
  public static void main (String[] args){
    int[] a = new int[]{2,4,1,2,3,9,1};
    insertionSort(a);
    System.out.println(Arrays.toString(a));
  }
}
