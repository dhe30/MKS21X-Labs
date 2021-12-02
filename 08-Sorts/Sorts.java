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
  public static void main (String[] args){
    // MANY DUPLICATES
    boolean win = true;
    int max = 9;
    int min = 7;
    int length = 10000;
    int[] sortTest = new int[length];
    int[] bubbleTest = new int[length];
    for (int i = 0; i < length; i++){
      int value = (int)(Math.random()*(max - min + 1)) + min;
      sortTest[i] = value;
      bubbleTest[i] = value;
    }
    Arrays.sort(sortTest);
    bubbleSort(bubbleTest);
    // System.out.println(Arrays.toString(sortTest));
    // System.out.println(Arrays.toString(bubbleTest));
    for (int i = 0; i < length; i++){
      if (bubbleTest[i] != sortTest[i]){
        System.out.println("Index: " + i + " Value: " + bubbleTest[i] + " Actual Value: " + sortTest[i]);
        win = false;
      }
    }
    if (win){
      System.out.println("Many duplicates Success");
    }
    // WITH NEGATIVES
    win = true;
    max = 1000;
    min = -1000;
    length = 10000;
    sortTest = new int[length];
    bubbleTest = new int[length];
    for (int i = 0; i < length; i++){
      int value = (int)(Math.random()*(max - min + 1)) + min;
      sortTest[i] = value;
      bubbleTest[i] = value;
    }
    Arrays.sort(sortTest);
    bubbleSort(bubbleTest);
    // System.out.println(Arrays.toString(sortTest));
    // System.out.println(Arrays.toString(bubbleTest));
    for (int i = 0; i < length; i++){
      if (bubbleTest[i] != sortTest[i]){
        System.out.println("Index: " + i + " Value: " + bubbleTest[i] + " Actual Value: " + sortTest[i]);
        win = false;
      }
    }
    if (win){
      System.out.println("With negatives Success");
    }
    // WITH ONLY ONE VALUE
    win = true;
    max = 1;
    min = 1;
    length = 10000;
    sortTest = new int[length];
    bubbleTest = new int[length];
    for (int i = 0; i < length; i++){
      int value = (int)(Math.random()*(max - min + 1)) + min;
      sortTest[i] = value;
      bubbleTest[i] = value;
    }
    Arrays.sort(sortTest);
    bubbleSort(bubbleTest);
    // System.out.println(Arrays.toString(sortTest));
    // System.out.println(Arrays.toString(bubbleTest));
    for (int i = 0; i < length; i++){
      if (bubbleTest[i] != sortTest[i]){
        System.out.println("Index: " + i + " Value: " + bubbleTest[i] + " Actual Value: " + sortTest[i]);
        win = false;
      }
    }
    if (win){
      System.out.println("Only one value Success");
    }
    // REVERSE SORT
    win = true;
    max = 1;
    min = 1;
    length = 10000;
    sortTest = new int[length];
    bubbleTest = new int[length];
    for (int i = 0; i < length; i++){
      int value = (int)(Math.random()*(max - min + 1)) + min;
      sortTest[i] = value;
      bubbleTest[i] = value;
    }
    int reverse = Arrays.sort(sortTest);
    bubbleSort(bubbleTest);
    // System.out.println(Arrays.toString(sortTest));
    // System.out.println(Arrays.toString(bubbleTest));
    for (int i = 0; i < length; i++){
      if (bubbleTest[i] != sortTest[i]){
        System.out.println("Index: " + i + " Value: " + bubbleTest[i] + " Actual Value: " + sortTest[i]);
        win = false;
      }
    }
    if (win){
      System.out.println("Only one value Success");
    }
  }
}
