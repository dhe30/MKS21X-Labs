public class Triangle{
  private Point v1;
  private Point v2;
  private Point v3;
  public Triangle(Point v11, Point v22, Point v33){
    v1 = v11;
    v2 = v22;
    v3 = v33;
  }
  public Triangle(double a, double b, double c, double d, double e, double f){
    v1 = new Point(a, b);
    v2 = new Point(c, d);
    v3 = new Point(e, f);
  }
  public Point getVertex(int a){
    if (a == 1){
      return v1;
    } else if (a == 2){
      return v2;
    } else if (a == 3){
      return v3;
    }
    return null;
  }
  public void setVertex(int a, Point b){
    if (a == 1){
      v1 = b;
    } else if (a == 2){
      v2 = b;
    } else if (a == 3){
      v3 = b;
    }
  }
  public String toString(){
    return "{" + v1 + ", " + v2 + ", " + v3 + "}";
  }
  public double getPerimeter(){
    return v1.distanceTo(v2)+v2.distanceTo(v3)+v3.distanceTo(v1);
  }
}
