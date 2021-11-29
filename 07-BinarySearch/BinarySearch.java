/*Precondition: data is sorted (increasing order)
 *@param data: the numbers to search through
 *@param target: the number you want to find
 *@return the index of data that contains the target value. Return -1 if the value is not in the array.
 *If there are multiple copies return the one you find first using
 *(min+max)/2 method described.
 */
import java.util.Arrays;
public class BinarySearch{
  public static int binarySearch(int[]data, int target){
    int start = 0;
    int end = data.length - 1;
    if (data.length > 0){
      while (end >= start){
        int mid = (start + end) / 2;
        if (data[mid] == target){
          return mid;
        } else if (data[mid] > target){
          end = mid - 1;
        } else if (data[mid] < target){
          start = mid + 1;
        }
        // System.out.println("Start: " + start);
        // System.out.println("End: " + end);
        // System.out.println("Middle: " + mid);
      }
    }
    return -1;
  }
  public static void main (String[] args){
    int[] a = new int[(int)Math.pow(3, 12) + 1];
    for(int i = 0; i < Math.pow(3, 12); i++){
      //expression for random integers from a to b inclusive
      int value = (int)(Math.random()*(999)) + 1;
      a[i] = value;
      a[a.length - 1] = 1000;
    }
    Arrays.sort(a);
    for(int i = 0; i < (int)Math.pow(3, 12); i++){
      int res = binarySearch(a, a[i]);
      if (res == -1 || a[i] != a[res]){
        System.out.println("FALSE");
      }
    }
    System.out.println(a[a.length -1]);
    System.out.println(a[a.length -3]);
    int b = binarySearch(a, 1000);
    System.out.println(b);
    System.out.println(a[b]);
  }
}
