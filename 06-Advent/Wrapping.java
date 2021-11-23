import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Wrapping{
  public static void yes(String a){
    try{
      File file = new File(a);
      Scanner input = new Scanner(file);
      while (input.hasNextLine()){
        String line = input.nextLine();
        String[] lhw = line.split("x");
        int len = Integer.parseInt(lhw[0]);
        int hig = Integer.parseInt(lhw[1]);
        int wid = Integer.parseInt(lhw[2]);
        int slh = len * hig;
        int slw = len * wid;
        int swh = wid * hig;
        int sa = (2 * slh) + (2 * slw) + (2 * swh);
        if (slh > slw){
          if (slw > swh || slw == swh){
            sa += swh;
          } else {
            sa += slw;
          }
        } else if (slh < slw || slh == slw){
          if (slh > swh || slh == swh){
            sa += swh;
          } else {
            sa += slh;
          }
        }
      }
      System.out.println(sa);
      input.close();
    } catch (FileNotFoundException){

    }
  }
  public static void main (String[] args){
    yes("input.txt");
  }
}
