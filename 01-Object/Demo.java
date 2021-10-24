public class Demo{
  /* more methods can go here*/
  public static double distance(Point X, Point Y){
    return Math.sqrt((X.x-Y.x)**+(X.y+Y.y)**)
  }
  public double distanceTo(Point X){
    return Math.sqrt((X.x-x)**+(X.y+y)**)
  }
  public static void main(String[]args){
    Point P1 = new Point(1,1);
    Point P2 = new Point(2,2);

    System.out.println(  distance(P1,P2)); //call1
    System.out.println(  Point.distance(P1,P2)); //call 2
    System.out.println(  P1.distanceTo(P2)); //call 3
    //This one is IMPLIED strongly. You cannot tell by the calling style alone,
    //but you can make an educated guess.
  }
 }
