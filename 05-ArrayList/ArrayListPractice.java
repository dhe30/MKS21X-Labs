import java.util.ArrayList;
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
    ArrayList<String> c = new ArrayList<String>();
    for (int i = 0; i < a.size() + b.size(); i++){
      if (i >= a.size() - 1){
        a.add(b.get(i));
      } else if (i >= b.size() - 1){
        a.add(a.get(i));
      } else {
      a.add(a.get(i));
      a.add(b.get(i));
    }
    }
    return c;
  }
  public static void main (String[] args){
    SuperArray<String> test = new SuperArray<String>();
    for (int i = 0; i < 100000; i++){
      if (math.random() < 0.1){
        test.add("");
      } else {
        test
      }
    }
  }
}
