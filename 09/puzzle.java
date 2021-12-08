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
    int startRow = (int)(Math.random()*(maxRow - min + 1)) + min;
    int startCol = (int)(Math.random()*(maxCol - min + 1)) + min;
    int a = 0;
    for (int i = startCol; i < length + startCol; i++){
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
    System.out.println(startRow + " and " + startCol);
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
        words.add(input.nextLine());
      }
      input.close();
    } catch (FileNotFoundException e){
        ;
    }
    fill(result);
    return result;
  }
  public static void main(String[] args){
    String[][] happy = make(5, 5, "input.txt");
    diagonalRight(happy, "YES", 5, 5);
    for (int i = 0; i < happy.length; i++){
      System.out.println(Arrays.toString(happy[i]));
    }
  }
}
