public class Demo{
  /* more methods can go here*/
  public static double distance(Point X, Point Y){
    return Math.sqrt(((X.getX()-Y.getX())*(X.getX()-Y.getX()))+((X.getY()-Y.getY())*(X.getY()-Y.getY())));
  }

  public static void main(String[]args){
    Point P1 = new Point(1,1);
    Point P2 = new Point(2,2);

    System.out.println(  distance(P1,P2)); //call1
    System.out.println(  Point.distance(P1,P2)); //call 2
    System.out.println(  P1.distanceTo(P2)); //call 3
    System.out.println(P1);
    System.out.println(P2);
    //This one is IMPLIED strongly. You cannot tell by the calling style alone,
    //but you can make an educated guess.
  }
 }
