import java.util.Arrays;
public class sortsTester{
  public static void doIt(int[] data, int mode){
    if (mode == 1){
      Sorts.bubbleSort(data);
    } else if (mode == 2){
      Sorts.selectionSort(data);
    } else if  (mode == 3){
      Sorts.insertionSort(data);
    }
  }
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
    doIt(Test, mode);
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
      } else if (mode == 3){
        System.out.println("Many duplicates Success: Insertion");
      }
    } else {
      System.out.println("Fail! :(");
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
    doIt(Test, mode);
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
      } else if (mode == 3){
        System.out.println("With negatives Success: Insertion");
      }
    } else {
      System.out.println("Fail! :(");
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
    doIt(Test, mode);
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
      } else if (mode == 3){
        System.out.println("Only one value Success: Insertion");
      }
    } else {
      System.out.println("Fail! :(");
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
    doIt(Test, mode);
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
        System.out.println("Reverse Success: Bubble");
      } else if (mode == 2){
        System.out.println("Reverse Success: Selection");
      } else if (mode == 3){
        System.out.println("Reverse Success: Insertion");
      }
    } else {
      System.out.println("Fail! :(");
    }
    // INDEX 0
    win = true;
    length = 0;
    sortTest = new int[length];
    Test = new int[length];
    try{
      Arrays.sort(sortTest);
      doIt(Test, mode);
    } catch(Exception e){
      win = false;
    }

    if (win){
      if (mode == 1){
        System.out.println("Index 0 Success: Bubble");
      } else if (mode == 2){
        System.out.println("Index 0 Success: Selection");
      } else if (mode == 3){
        System.out.println("Index 0 Success: Insertion");
      }
    } else {
      System.out.println("Fail! :(");
    }
    // Index 1
    win = true;
    length = 1;
    sortTest = new int[length];
    Test = new int[length];
    for (int i = length - 1; i >= 0; i--){
      sortTest[i] = i;
      Test[i] = i;
    }
    try{
      Arrays.sort(sortTest);
      doIt(Test, mode);
    } catch(Exception e){
      System.out.println("Index 1 exception");
      win = false;
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
        System.out.println("Index 1 Success: Bubble");
      } else if (mode == 2){
        System.out.println("Index 1 Success: Selection");
      } else if (mode == 3){
        System.out.println("Index 1 Success: Insertion");
      }
    } else {
      System.out.println("Fail! :(");
    }
    // SORTED SORT
    win = true;
    length = 10000;
    sortTest = new int[length];
    Test = new int[length];
    for (int i = 0; i < length; i++){
      sortTest[i] = i;
      Test[i] = i;
    }
    Arrays.sort(sortTest);
    doIt(Test, mode);
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
        System.out.println("Sorted Success: Bubble");
      } else if (mode == 2){
        System.out.println("Sorted Success: Selection");
      } else if (mode == 3){
        System.out.println("Sorted Success: Insertion");
      }
    } else {
      System.out.println("Fail! :(");
    }
  }
}
