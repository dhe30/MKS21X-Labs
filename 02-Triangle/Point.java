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
  public String toString(){
    return "(" + x + ", " + y + ")";
  }
  public static boolean closeEnough(double a, double b){
    return (Math.abs(a - b)/a)*100.0 <= 0.001;
  }
  public boolean equals(Point other){
    return (closeEnough(x, other.x) && closeEnough(y, other.y));
  }
  public static void main(String[] args){
    Point one = new Point(0.0, 2.0);
    Point one1 = new Point(0.0, 2.0);
    Point two = new Point(0.0, -2.0);
    Point three = new Point(0.00001, 0.00000999999);
    Point four = new Point(0.00000999999, 0.00001);
    Triangle a = new Triangle(0.0,1.0,0.0,0.0,1.0,0.0);
    Triangle b = new Triangle(0.0,-1.0,0.0,0.0,-1.0,0.0);
    Triangle c = new Triangle(5.0,0.0,0.0,0.0,5.0,10.0);
    Triangle is = new Triangle(0.0,0.0,0.5,Math.sqrt(3),1.0,0.0);
    Triangle eq = new Triangle(0.0,0.0,0.5,Math.sqrt(3)/2,1.0,0.0);
    System.out.println(a);
    System.out.println(a.getPerimeter());
    System.out.println(a.getVertex(1));
    a.setVertex(1, one);
    System.out.println(a);
    System.out.println(a.getPerimeter());
    //
    System.out.println(b);
    System.out.println(b.getPerimeter());
    System.out.println(b.getVertex(1));
    b.setVertex(1, two);
    System.out.println(b);
    System.out.println(b.getPerimeter());
    //
    System.out.println(c);
    System.out.println(c.getPerimeter());
    System.out.println(c.getVertex(1));
    c.setVertex(1, two);
    System.out.println(c);
    System.out.println(c.getPerimeter());
    //
    Triangle a1 = new Triangle(1.0,1.0,2.0,2.0,3.0,3.0);
    Triangle a2 = new Triangle(1.0,1.0,2.0,2.0,3.0,3.0);
    System.out.println(closeEnough(0.00001, 0.00000999999));
    System.out.println(one.equals(one1));
    System.out.println(a1.area());
    System.out.println(a1.classify());
    //
    System.out.println(eq.area());
    System.out.println(eq.classify());
    //
    System.out.println(is.area());
    System.out.println(is.classify());
    System.out.println(a1.equals(a2));
  }
}
