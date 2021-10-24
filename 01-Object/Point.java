public class Point{
  private double x,y;
  public Point(double X, double Y){
    x=X;
    y=Y;
  }
  public Point(Point p){
    x= p.x;
    y= p.y;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }
  public static double distance(Point X, Point Y){
    return Math.sqrt((X.x-Y.x)*(X.x-Y.x)+(X.y-Y.y)*(X.y-Y.y));
  }
  public double distanceTo(Point X){
    return Math.sqrt((X.x-x)*(X.x-x)+(X.y-y)*(X.y-y));
  }
}
