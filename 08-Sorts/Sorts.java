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
  public static void main (String[] args){
    
  }
}
