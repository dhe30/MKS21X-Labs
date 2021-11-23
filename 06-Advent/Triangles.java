import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Triangles {
  public static void triNum(String a){
    try {
      int res = 0;
      File file = new File(a);
      Scanner input = new Scanner(file);
      while (input.hasNextInt()) {
          int x = input.nextInt();
          int z = input.nextInt();
          int y = input.nextInt();
          if (x + z > y && z + y > x && x + y > z){
            res++;
          }
      }
      System.out.println(res);
      input.close();//releases the file from your program

      }   catch (FileNotFoundException ex) {
      }
    }
    public static void triNum2(String a){
      try {
        int res = 0;
        File file = new File(a);
        Scanner input = new Scanner(file);
        while (input.hasNextInt()) {
          Scanner line1 = new Scanner(input.nextLine());
          Scanner line2 = new Scanner(input.nextLine());
          Scanner line3 = new Scanner(input.nextLine());
          for (int i = 0; i < 3; i++){
            int x = line1.nextInt();
            int z = line2.nextInt();
            int y = line3.nextInt();
            if (x + z > y && z + y > x && x + y > z){
              res++;
            }
          }
        }
        System.out.println(res);
        input.close();//releases the file from your program

        }   catch (FileNotFoundException ex) {
        }
      }
  public static void main (String[] args){
    String file = args[0];
    int a = Integer.parseInt(args[1]);
    if (a == 2){
      triNum2(file);
    } else {
      triNum(file);
    }
  }
}
