import java.util.Arrays;
public class sortsTester extends Sorts{
  public static void main (String[] args){
    // MANY DUPLICATES
    int mode = Integer.parseInt(args[0]);
    boolean win = true;
    int max = 9;
    int min = 7;
    int length = 10000;
    int[] sortTest = new int[length];
    int[] Test = new int[length];
    for (int i = 0; i < length; i++){
      int value = (int)(Math.random()*(max - min + 1)) + min;
      sortTest[i] = value;
      Test[i] = value;
    }
    Arrays.sort(sortTest);
    if (mode == 1){
      bubbleSort(Test);
    } else if (mode == 2){
      selectionSort(Test);
    }
    // System.out.println(Arrays.toString(sortTest));
    // System.out.println(Arrays.toString(Test));
    for (int i = 0; i < length; i++){
      if (Test[i] != sortTest[i]){
        System.out.println("Index: " + i + " Value: " + Test[i] + " Actual Value: " + sortTest[i]);
        win = false;
      }
    }
    if (win){
      if (mode == 1){
        System.out.println("Many duplicates Success: Bubble");
      } else if (mode == 2){
        System.out.println("Many duplicates Success: Selection");
      }
    }
    // WITH NEGATIVES
    win = true;
    max = 1000;
    min = -1000;
    length = 10000;
    sortTest = new int[length];
    Test = new int[length];
    for (int i = 0; i < length; i++){
      int value = (int)(Math.random()*(max - min + 1)) + min;
      sortTest[i] = value;
      Test[i] = value;
    }
    Arrays.sort(sortTest);
    if (mode == 1){
      bubbleSort(Test);
    } else if (mode == 2){
      selectionSort(Test);
    }
    // System.out.println(Arrays.toString(sortTest));
    // System.out.println(Arrays.toString(Test));
    for (int i = 0; i < length; i++){
      if (Test[i] != sortTest[i]){
        System.out.println("Index: " + i + " Value: " + Test[i] + " Actual Value: " + sortTest[i]);
        win = false;
      }
    }
    if (win){
      if (mode == 1){
        System.out.println("With negatives Success: Bubble");
      } else if (mode == 2){
        System.out.println("With negatives Success: Selection");
      }
    }
    // WITH ONLY ONE VALUE
    win = true;
    max = 1;
    min = 1;
    length = 10000;
    sortTest = new int[length];
    Test = new int[length];
    for (int i = 0; i < length; i++){
      int value = (int)(Math.random()*(max - min + 1)) + min;
      sortTest[i] = value;
      Test[i] = value;
    }
    Arrays.sort(sortTest);
    if (mode == 1){
      bubbleSort(Test);
    } else if (mode == 2){
      selectionSort(Test);
    }
    // System.out.println(Arrays.toString(sortTest));
    // System.out.println(Arrays.toString(Test));
    for (int i = 0; i < length; i++){
      if (Test[i] != sortTest[i]){
        System.out.println("Index: " + i + " Value: " + Test[i] + " Actual Value: " + sortTest[i]);
        win = false;
      }
    }
    if (win){
      if (mode == 1){
        System.out.println("Only one value Success: Bubble");
      } else if (mode == 2){
        System.out.println("Only one value Success: Selection");
      }
    }
    // REVERSE SORT
    win = true;
    length = 10000;
    sortTest = new int[length];
    Test = new int[length];
    for (int i = length - 1; i >= 0; i--){
      sortTest[i] = i;
      Test[i] = i;
    }
    Arrays.sort(sortTest);
    if (mode == 1){
      bubbleSort(Test);
    } else if (mode == 2){
      selectionSort(Test);
    }
    // System.out.println(Arrays.toString(sortTest));
    // System.out.println(Arrays.toString(Test));
    for (int i = 0; i < length; i++){
      if (Test[i] != sortTest[i]){
        System.out.println("Index: " + i + " Value: " + Test[i] + " Actual Value: " + sortTest[i]);
        win = false;
      }
    }
    if (win){
      if (mode == 1){
        System.out.println("Many duplicates Success: Bubble");
      } else if (mode == 2){
        System.out.println("Many duplicates Success: Selection");
      }
    }
  }
}
