import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class puzzle{
  public static void horizontal(String[][] empty, String word, int row, int col){
    int length = word.length();
    int min = 0;
    int maxRow = row - 1;
    int maxCol = col - length;
    int a = 0;
    boolean badLap = true;
    boolean wasBad = false;
    int startCol = 0;
    int startRow = 0;
    while (badLap){
      wasBad = false;
      startRow = (int)(Math.random()*(maxRow - min + 1)) + min;
      startCol = (int)(Math.random()*(maxCol - min + 1)) + min;
      for (int i = startCol; i < length + startCol; i++){
        if (Character.isLowerCase(empty[startRow][i].charAt(0)) && !empty[startRow][i].equals(word.substring(a, a + 1))) {
          wasBad = true;
          System.out.println("yes");
        }
      }
      if(!wasBad){
        badLap = false;
      }
    }
    for (int i = startCol; i < length + startCol; i++){
      System.out.println(startRow + " and " + startCol);
        empty[startRow][i] = word.substring(a, a + 1);
        a++;
    }
  }
  public static void diagonalRight(String[][] empty, String word, int row, int col){
    int length = word.length();
    int min = 0;
    int maxRow = row - length;
    int maxCol = col - length;
    int startRow = (int)(Math.random()*(maxRow - min + 1)) + min;
    int startCol = (int)(Math.random()*(maxCol - min + 1)) + min;

    int a = 0;
    while (a != length){
      empty[startRow][startCol] = word.substring(a, a + 1);
      startCol++;
      startRow++;
      a++;
    }
  }
  public static void fill(String[][] empty){
    int max = 90;
    int min = 65;
    for (int i = 0; i < empty.length; i++){
      for (int a = 0; a < empty[i].length; a++){
        int value = (int)(Math.random()*(max - min + 1)) + min;
        empty[i][a] = Character.toString((char)value);
      }
    }
  }
  public static String[][] make(int row, int col, String word){
    String[][] result = new String[row][col];
    ArrayList<String> words = new ArrayList<String>();
    try{
      File file = new File(word);
      Scanner input = new Scanner(file);
      while (input.hasNextLine()){
        words.add(input.nextLine().toLowerCase());
      }
      input.close();
    } catch (FileNotFoundException e){
        ;
    }
    fill(result);
    for (int i = 0; i < words.size(); i++){
      horizontal(result, words.get(i), row, col);
    }
    return result;
  }
  public static void main(String[] args){
    String[][] happy = make(2, 5, "input.txt");

    for (int i = 0; i < happy.length; i++){
      System.out.println(Arrays.toString(happy[i]));
    }
  }
}
