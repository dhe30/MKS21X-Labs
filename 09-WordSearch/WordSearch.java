/*Lab9: Word Search generator
*/
public class WordSearch{
    private char[][]data;

    /**Initialize the grid to the size specified
     *and fill all of the positions with '_'
     *@param rows is the starting height of the WordSearch
     *@param cols is the starting width of the WordSearch
     */
    public WordSearch(int rows,int cols){
      data = new char[rows][cols];
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
      if (word.length() + col > max){
        return false;
      }
      for (int i = col; i < word.length() + col; i++){
        if (data[row][i] != '_' && data[row][i] != word.charAt(a)){
          return false;
        } else {
            data[row][i] = word.charAt(a);
            a++;
        }
      }
      return true
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
      if (word.length() + col > maxCol || words.length() + row > maxRow){
        return false;
      }
      while (a != word.length()){
        if (data[row][col] != '_' && data[row][col] != word.charAt(a)){
          return false;
        } else {
          data[row][col] = word.charAt(a);
          col++;
          row++;
          a++;
        }
      }
    }
}
