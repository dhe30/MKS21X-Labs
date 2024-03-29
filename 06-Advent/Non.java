import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Non{
  public static boolean vowel(String a){
    return (a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u"));
  }
  public static boolean threeVowel(String a){
    int res = 0;
    for (int i = 0; i < a.length(); i++){
      if (vowel(a.substring(i, i + 1))){
        res++;
      }
    }
    return res >= 3;
  }
  public static boolean lap(String a){
    if (a.length() > 1){
      for (int i = 0; i < a.length() - 1; i++){
        if (a.substring(i, i + 1).equals(a.substring(i + 1, i + 2))){
          return true;
        }
      }
    }
    return false;
  }
  public static boolean not(String a){
    for (int i = 0; i < a.length() - 1; i++){
      String b = a.substring(i, i + 2);
      if (b.equals("ab") || b.equals("cd") || b.equals("pq") || b.equals("xy")) {
        return false;
      }
    }
    return true;
  }
  public static boolean lapForPartTwo(String a){
    for (int i = 0; i < a.length() - 1; i++){
      String b = a.substring(i, i + 2);
      if (a.lastIndexOf(b) > a.indexOf(b) + 1){
        return true;
      }
    }
    return false;
  }
  public static boolean theSecondConditionForPartTwo(String a){
    for (int i = 0; i < a.length() - 2; i++){
      String b = a.substring(i, i + 3);
      if (b.substring(0, 1).equals(b.substring(2, 3))){
        return true;
      }
    }
    return false;
  }
  public static void yes(String a){
    try{
      int res = 0;
      File file = new File(a);
      Scanner input = new Scanner(file);
      while (input.hasNextLine()){
        String ab = input.nextLine();
        if (threeVowel(ab) && lap(ab) && not(ab)){
          res++;
        }
      }
      System.out.println(res);
      input.close();
    } catch (FileNotFoundException e){
        ;
    }
  }
  public static void yes2(String a){
    try{
      int res = 0;
      File file = new File(a);
      Scanner input = new Scanner(file);
      while (input.hasNextLine()){
        String ab = input.nextLine();
        if (lapForPartTwo(ab) && theSecondConditionForPartTwo(ab)){
          res++;
        }
      }
      System.out.println(res);
      input.close();
    } catch (FileNotFoundException e){
        ;
    }
  }
  public static void main (String[] args){
    String file = args[0];
    int a = Integer.parseInt(args[1]);
    if (a == 1){
      yes(file);
    } else {
      yes2(file);
    }
  }
}
