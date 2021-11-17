import java.util.ArrayList;
//import java.util.Random;
public class ArrayListPractice{
  public static ArrayList<String> replaceEmpty( ArrayList<String> data){
    //return an new ArrayList that has all of the values of the original ArrayList except
    //that all empty strings are replaced with the word "Empty".
    ArrayList<String> a = new ArrayList<String>();
    for (int i = 0; i < data.size(); i++){
      if (data.get(i).equals("")){
        a.add("Empty");
      } else {
        a.add(data.get(i));
      }
    }
    return a;
  }

  public static ArrayList<String> makeReversedList( ArrayList<String> data){
    //return a new ArrayList that is in the reversed order of the parameter.
    ArrayList<String> a = new ArrayList<String>();
    for (int i = data.size() - 1; i >= 0; i--){
      a.add(data.get(i));
    }
    return a;
  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    //return a new ArrayList that has all values of a and b in alternating order that is:
    //a[0], b[0], a[1], b[1]...
    //when one list is longer than the other, just append the remaining values to the end.
    ArrayList<String> w = new ArrayList<String>();
    if (a.size() > b.size()){
      int i;
      for (i = 0; i < b.size(); i++){
        w.add(a.get(i));
        w.add(b.get(i));
      }
      for (int c = i; c < a.size(); i++){
        w.add(a.get(c));
      }
    } else if (a.size() < b.size()){
      int i;
      for ( i = 0; i < a.size(); i++){
        w.add(a.get(i));
        w.add(b.get(i));
      }
      for (int c = i; c < b.size(); i++){
        w.add(b.get(c));
      }
    } else {
        for (int i = 0; i < a.size(); i++){
          w.add(a.get(i));
          w.add(b.get(i));
        }
      }

    return w;
  }
  public static void main (String[] args){
    ArrayList<String> test1 = new ArrayList<String>();
    for (int i = 0; i < 1000000; i++){
      if (Math.random() < 0.1){
        test1.add("");
      } else {
        test1.add("" + Math.random());
      }
    }
    ArrayList<String> test2 = new ArrayList<String>();
    for (int i = 0; i < 1000000; i++){
      if (Math.random() < 0.1){
        test2.add("");
      } else {
        test2.add("" + Math.random());
      }
    }
    ArrayList<String> testEmpty = replaceEmpty(test1);
    ArrayList<String> testReverse = makeReversedList(test1);
    ArrayList<String> testMix = mixLists(test1, test2);
    for (int i = 0; i < test1.size(); i++){
      if (test1.get(i).equals("") && !testEmpty.get(i).equals("Empty")){
        System.out.println("false");
      }
    }
    int reverse = testReverse.size() - 1;
//    testReverse.set(1000, "yes");
    for (int i = 0; i < test1.size(); i++){
      if (!test1.get(i).equals(testReverse.get(reverse))) {
        System.out.println("false");
      }
      reverse--;
    }
  }
}
