import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Triangles {
  public static void triNum(String a){
    try {
      int res = 0;
      File file = new File(a);
      Scanner input = new Scanner(file);
      int z, x, y;
      Scanner inputLine = new Scanner(input.nextLine());
      while (input.hasNextLine()) {
        for (int i = 0; i < 3; i++){
          x = inputLine.nextInt();
          z = inputLine.nextInt();
          y = inputLine.nextInt();
          if (x + z > y && z + y > x && x + y > z){
            res++;
          }
          inputLine = new Scanner(input.nextLine());
        }
      }
      System.out.println(res);
      input.close();//releases the file from your program

      }   catch (FileNotFoundException ex) {
      }
    }
  public static void main (String[] args){
    triNum("data.txt");
  }
}
