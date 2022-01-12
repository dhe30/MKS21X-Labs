import java.util.Scanner;
public class Game{
  /*Base colors*/
  public static final int BLACK = 30;
  public static final int RED = 31;
  public static final int GREEN = 32;
  public static final int YELLOW = 33;
  public static final int BLUE = 34;
  public static final int MAGENTA = 35;
  public static final int CYAN = 36;
  public static final int WHITE = 37;

  /*Text modifiers to be ADDED to a color*/
  public static final int BACKGROUND = 10;
  public static final int BRIGHT = 60;

  /*Text modifiers that are separate from color*/
  public static final int BOLD = 1;
  public static final int UNDERLINE = 4;
  public static final int INVERTED = 7;
  public static void numbers(int[] a){
    for (int i = 0; i < 4; i++){
      int Science = a[i];
      Text.go(2,2 + i*19);
      if (Science < 25){
        System.out.print(Text.colorize("" + Science, RED));
      } else if (Science > 75){
        System.out.print(Text.colorize("" + Science, GREEN));
      } else {
        System.out.print(Text.colorize("" + Science, WHITE));
      }
    }
    Text.go(31, 1);
  }
  public static void did(){
    Text.hideCursor();
    Text.clear();
    Text.go(1,1);
    for (int a = 0; a < 80; a++){
      System.out.print(Text.colorize(" ", WHITE + BACKGROUND));
    }
    for (int i = 1; i < 29; i++){
      Text.go(1+i, 1);
      System.out.print(Text.colorize("a", RED + BACKGROUND));
      Text.go(1 + i, 80);
      System.out.print(Text.colorize(" ", WHITE + BACKGROUND));
    }
    Text.go(30,1);
    for (int a = 0; a < 80; a++){
      System.out.print(Text.colorize(" ", WHITE + BACKGROUND));
    }

    Text.go(31,1);
    Text.reset();
    Text.showCursor();
  }
  public static void main (String[] args){
    did();
    int[] rando = new int[4];
    for (int i = 0; i < 4; i++){
      rando[i] = (int)(Math.random()*100);
    }
    numbers(rando);
    Scanner input = new Scanner(System.in);
    System.out.print(">");

    String in = input.nextLine();
    while (!in.equals("q") && !in.equals("quit")){
      if (in.equals("")){
        ;
      } else{
      for (int i = 0; i < 4; i++){
        rando[i] = (int)(Math.random()*100);
      }}
      did();
      numbers(rando);
      input = new Scanner(System.in);
      System.out.print(">");
      in = input.nextLine();
    }
  }
}
