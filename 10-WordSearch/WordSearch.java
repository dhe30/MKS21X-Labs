import java.util.*;
import java.io.*;
public class WordSearch{
  private char[][] grid;
  private ArrayList<String> wordsAdded;
  private Random rng;
  private int seed;

  //assume a rectangular grid
  private void addAllWords(String filename){
    ArrayList<String> wordsToAdd = loadWordsFromFile(filename);
    int length = wordsToAdd.size();
    for (int i = 0; i < length ; i++){
      boolean added = false;
      int a = 0;
      String currentWord = wordsToAdd.get(rng.nextInt(wordsToAdd.size()));
      while (!added && a < 10000){
        if (addWord(currentWord, rng.nextInt(grid.length), rng.nextInt(grid[1].length), rng.nextInt(3) - 1, rng.nextInt(3) - 1) ) {
          wordsToAdd.remove(currentWord);
          added = true;
        } else {
          a++;
        }
      }
    }
    //You are writing this

  }

  public WordSearch(int rows,int cols, String fileName){
    rng = new Random();
    seed = rng.nextInt();
    rng = new Random(seed);
    grid = new char[rows][cols];
    clear();
    wordsAdded = new ArrayList<String>();
    addAllWords(fileName);
  }

  public WordSearch(int rows,int cols, String fileName, int s){
    seed = s;
    rng = new Random(seed);
    grid = new char[rows][cols];
    clear();
    wordsAdded = new ArrayList<String>();
    addAllWords(fileName);
  }

  public static ArrayList<String> loadWordsFromFile(String fileName){
    ArrayList<String>words = new ArrayList<String>();
    try{
      Scanner input = new Scanner(new File(fileName));
      while(input.hasNextLine()){
        String line = input.nextLine();
        if(! line.equals("")){
          words.add(line.toUpperCase());
        }
      }
    }catch(FileNotFoundException e){
      System.out.println(e);
      System.exit(1);
    }
    return words;
  }



  private void clear(){
    for(int r = 0; r < grid.length; r++){
      for(int c = 0; c < grid[r].length; c++){
        grid[r][c]='_';
      }
    }
  }


  //precondition word grids are rectangular
  private boolean inBounds(int r, int c){
    return r >= 0 && r < grid.length && c >= 0 && c < grid[0].length;
  }
  public boolean addWord(String word,int row, int col, int dr, int dc){
    //make sure there is some non 0 vector for direction
    if(dr == 0 && dc == 0){
      return false;
    }
    //check endpoints of word
    if(!inBounds(row,col) || !inBounds(row + dr * (word.length() - 1), col + dc * (word.length() - 1 ))){
      return false;
    }
    //check for conflicting letters
    for(int i = 0; i < word.length(); i++){
      char c = grid[row + i * dr][col + i * dc];
      if(c != '_' && c != word.charAt(i)){
        return false;
      }
    }
    //change
    for(int i = 0; i < word.length(); i++){
      grid[row + i * dr][col + i * dc] = word.charAt(i);
    }
    wordsAdded.add(word);
    return true;
  }

  public String toString(){
    String ans = "";
    for(int r = 0; r < grid.length; r++){
      for(int c = 0; c < grid[r].length; c++){
        ans += grid[r][c]+" ";
      }
      ans+="\n";
    }
    ans += "words: ";
    for(String word:wordsAdded){
      ans+= word+" ";
    }
    ans += "\nseed: "+seed;
    return ans;
  }

  public void fillInRandomLetters(){
    for (int i = 0; i < grid.length; i++){
      for (int a = 0; a < grid[i].length; a++){
        if (grid[i][a] == ('_')){
          grid[i][a] = (char)(rng.nextInt(25) + 65);
        }
      }
    }
  }
  public static void main(String[] args){
    int rows = Integer.parseInt(args[0]);
    int col = Integer.parseInt(args[1]);
    String filename = args[2];
    int mode = Integer.parseInt(args[3]);
    WordSearch result = new WordSearch(rows, col, filename);
    if (args.length == 5){
      int seed = Integer.parseInt(args[4]);
       result = new WordSearch(rows, col, filename, seed);
    }

    if (mode == 0){
      result.fillInRandomLetters();
    }
    System.out.println(result);
  }
}
