import java.util.Arrays;
public class Sorts{

  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int length = data.length;
    int switched = 1;
    while (switched != 0){
      for (int a = 0; a < length - 1; a++){
        if (data[a] > data[a + 1]){
          int h = data[a];
          data[a] = data[a + 1];
          data[a + 1] = h;
          switched++;
        }
      }
      length--
    }
  }
  public static void main (String[] args){
    int[] a = new int[]{0, 1, 2, 1, 5, 3, 4};
    bubbleSort(a);
    System.out.println(Arrays.toString(a));
  }
}
