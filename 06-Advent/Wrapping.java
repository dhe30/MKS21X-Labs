import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Wrapping{
  public static void yes(String a){
    try{
      int res = 0;
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
        res += sa;
      }
      System.out.println(res);
      input.close();
    } catch (FileNotFoundException e){

    }
  }
  public static void yes2(String a){
    try{
      int res = 0;
      File file = new File(a);
      Scanner input = new Scanner(file);
      while (input.hasNextLine()){
        String line = input.nextLine();
        String[] lhw = line.split("x");
        int len = Integer.parseInt(lhw[0]);
        int hig = Integer.parseInt(lhw[1]);
        int wid = Integer.parseInt(lhw[2]);
        int ca = len * hig * wid;
        int max = 0;
        if (len > hig){
          if (len > wid || len == wid){
            max = len;
          } else {
            max = wid;
          }
        } else if (len < hig || len == hig){
          if (hig > wid || hig == wid){
            max = hig;
          } else {
            max = wid;
          }
        }
        int length = (len + hig + wid - max) * 2;
        res = res + ca + length;
      }
      System.out.println(res);
      input.close();
    } catch (FileNotFoundException e){

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
