/*Lab9: Word Search generator
*/
import java.util.*; //random, scanner, arraylist
import java.io.*; //file, filenotfoundexception
public class WordSearch{
    //the random seed used to produce this WordSearch
    private int seed;
    //a random Object to unify your random calls
    private Random randgen;
    private char[][]data;
    //all words that were successfully added get moved into wordsAdded.
    private ArrayList<String>wordsAdded;
    /**Initialize the grid to the size specified
     *and fill all of the positions with '_'
     *@param rows is the starting height of the WordSearch
     *@param cols is the starting width of the WordSearch
     */
    public WordSearch( int rows, int cols, String fileName){
       //Choose a randSeed using the clock random
       randgen = new Random();
       seed = randgen.nextInt();
       randgen = new Random(seed);

       data = new char[rows][cols];
       clear();
    }
    public WordSearch( int rows, int cols, String fileName, int randSeed){
        //Use the random seed specified.
        seed = randSeed;
        randgen = new Random(seed);

        data = new char[rows][cols];
        clear();
    }

    public WordSearch(int rows,int cols){
      data = new char[rows][cols];
      clear();
    }

    /**Set all values in the WordSearch to underscores'_'*/
    private void clear(){
      for (int i = 0; i < data.length; i++){
        for (int a = 0; a < data[i].length; a++){
          data[i][a] = '_';
        }
      }
    }

    /**Each row is a new line, there is a space between each letter
     *@return a String with each character separated by spaces, and rows
     *separated by newlines.
     */
    public String toString(){
      String result = "";
      for (int i = 0; i < data.length; i++){
        for (int a = 0; a < data[i].length; a++){
          result += data[i][a] + " ";
        }
        result += "\n";
      }
      return result;
    }


    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     * or there are overlapping letters that do not match, then false is returned
     * and the board is NOT modified.
     */
    public boolean addWordHorizontal(String word,int row, int col){
      int a = 0;
      int max = data[row].length;
      int maxRow = data.length;
      if (word.length() + col > max || row > maxRow || col < 0 || row < 0){
        return false;
      }
      for (int i = col; i < word.length() + col; i++){
        if (data[row][i] != '_' && data[row][i] != word.charAt(a)){
          return false;
        }
      }
      for (int i = col; i < word.length() + col; i++){
            data[row][i] = word.charAt(a);
            a++;
      }
      return true;
    }


   /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top to bottom, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     *and the board is NOT modified.
     */
    public boolean addWordVertical(String word,int row, int col){
      int a = 0;
      int maxCol = data[row].length;
      int maxRow = data.length;
      if (col > maxCol || word.length() + row > maxRow || col < 0 || row < 0){
        return false;
      }
      while (a != word.length()){
        if (data[row][col] != '_' && data[row][col] != word.charAt(a)){
          return false;
        }
        row++;
        a++;
      }
      a = 0;
      row = 0;
      while (a != word.length()){
          data[row][col] = word.charAt(a);
          row++;
          a++;
      }
      return true;
    }
    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top left towards the bottom right, it must fit on the board,
     *and must have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     */
    public boolean addWordDiagonal(String word,int row, int col){
      int maxCol = data[row].length;
      int maxRow = data.length;
      if (word.length() > maxCol || word.length() > maxRow){
        return false;
      }
      if (word.length() + col > maxCol || word.length() + row > maxRow || row < 0 || col < 0){
        return false;
      }
      int a = 0;
      int testCol = col;
      int testRow = row;
      while (a != word.length()){
        if (data[row][col] != '_' && data[row][col] != word.charAt(a)){
          return false;
        }
        testRow++;
        testCol++;
        a++;
      }
      for (int i = 0; i < word.length(); i++){
        data[row][col] = word.charAt(i);
        col++;
        row++;
      }
      return true;
    }
    /**Attempts to add a given word to the specified position of the WordGrid.
   *The word is added in the direction rowIncrement,colIncrement
   *Words must have a corresponding letter to match any letters that it overlaps.
   *
   *@param word is any text to be added to the word grid.
   *@param row is the vertical locaiton of where you want the word to start.
   *@param col is the horizontal location of where you want the word to start.
   *@param rowInc is -1,0, or 1 and represents the displacement of each letter in the row direction
   *@param colInc is -1,0, or 1 and represents the displacement of each letter in the col direction
   *@return true when: the word is added successfully.
   *        false (and do not change the board at all) when any of the following happen:
   *        a) rowInc and colInc are both 0,
   *        b) the word doesn't fit,
   *        c) there are overlapping letters that do not match
   */
     private boolean addWord(int row, int col, String word, int rowInc, int colInc){
       int maxCol = data[row].length;
       int maxRow = data.length;
       if (row > maxRow || col > maxCol || col < 0 || row < 0){
         return false;
       }
       if (rowInc == 0){
         if (colInc == 0){
           return false;
         } else if (colInc == 1){
           if (word.length() + col > maxCol){
             return false;
           }
           for (int i = col; i < word.length(); i++){
             if (data[row][i] != '_' && data[row][i] != word.charAt(i - col)){
               return false;
             }
           }
           for (int i = col; i < word.length(); i++){
             data[row][i] = word.charAt(i - col);
           }
           ;
         } else if (colInc == -1){
           if (col - word.length() < -1){
             return false;
           }
           for (int i = col; i >= col - word.length() + 1; i--){
             if (data[row][i] != '_' && data[row][i] != word.charAt(col - i)){
               return false;
             }
           }
           for (int i = col; i >= col - word.length() + 1; i--){
             data[row][i] = word.charAt(col - i);
           }
           ;
         }
     } else if (rowInc == 1){
       if (colInc == 0){
         if (word.length() + row > maxRow){
           return false;
         }
         for (int i = row; i < word.length(); i++){
           if (data[i][col] != '_' && data[i][col] != word.charAt(i - row)){
             return false;
           }
         }
         for (int i = row; i < word.length(); i++){
           data[i][col] = word.charAt(i - row);
         }
       } else if (colInc == 1){
         if (word.length() + row > maxRow || word.length() + col > maxCol){
           return false;
         }
         for (int i = 0; i < word.length(); i++){
           if (data[row + i][col + i] != '_' && data[row + i][col + i] != word.charAt(i)){
             return false;
           }
         }
         for (int i = 0; i < word.length(); i++){
           data[row + i][col + i] = word.charAt(i);
         }
       } else if (colInc == -1){
         if (word.length() + row > maxRow || col - word.length() < -1){
           return false;
         }
         for (int i = 0; i < word.length(); i++){
           if (data[row + i][col - i] != '_' && data[row + i][col - i] != word.charAt(i)){
             return false;
           }
         }
         for (int i = 0; i < word.length(); i++){
           data[row + i][col - i] = word.charAt(i);
         }
       }
     } else if (rowInc == -1){
       if (colInc == 0){
         if (row - word.length() < -1){
           return false;
         }
         for (int i = 0; i < word.length(); i++){
           if (data[row - i][col] != '_' && data[row - i][col] != word.charAt(i)){
             return false;
           }
         }
         for (int i = 0; i < word.length(); i++){
           data[row - i][col]= word.charAt(i);
         }
       } else if (colInc == 1){
         if (row - word.length() < -1 || col + word.length() > maxCol){
           return false;
         }
         for (int i = 0; i < word.length(); i++){
           if (data[row - i][col + i] != '_' && data[row - i][col + i] != word.charAt(i)){
             return false;
           }
         }
         for (int i = 0; i < word.length(); i++){
           data[row - i][col + i]= word.charAt(i);
         }
       } else if (colInc == -1){
         if (row - word.length() < -1 || col - word.length() < -1){
           return false;
         }
         for (int i = 0; i < word.length(); i++){
           if (data[row - i][col - i] != '_' && data[row - i][col - i] != word.charAt(i)){
             return false;
           }
         }
         for (int i = 0; i < word.length(); i++){
           data[row - i][col - i]= word.charAt(i);
         }
       }
       ;
     }
     return true;
   }
   private void addAllWords(String filename) {
      /*Attempt to add all of the words from the file of words list using the algorithm described above
       *Suggestion: read your file into an ArrayList of Strings. */
      ArrayList<
      try{
        File file = new File(filename);
        Scanner input = new Scanner(file);
        while (input.hasNextLine()){
          words.add(input.nextLine());
        }
      } catch (FileNotFoundException e){
        ;
      }
      int a = 0;
      while ()
    }
}
