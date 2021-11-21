import java.util.Scanner;
import java.util.ArrayList;
public class UserInput{
  public static void main (String[] args){
    ArrayList<Double> list = new ArrayList<Double>();
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a non negative number. A negative number will end the program:");
    double mary = in.nextDouble();
    while (mary >= 0) {
      list.add(mary);
      System.out.println("Enter a non negative number. A negative number will end the program:");
      mary = in.nextDouble();
    }
    System.out.println("You entered: " + list);
    if (list.size() != 0){
      double min = list.get(0);
      double max = min;
      double mean = 0.0;
      for (int i = 0; i < list.size(); i++){
        if (list.get(i) < min){
          min = list.get(i);
        } else if (list.get(i) > max){
          max = list.get(i);
        }
        mean += list.get(i);
      }
      System.out.println("Mean: " + (mean / list.size()));
      System.out.println("Min value: " + min);
      System.out.println("Max value: " + max);
    }
  }
}
