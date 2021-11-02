public class Tester{
  public static void main(String[] args){
    RealNumber a = new RealNumber(3.3);
    RealNumber b = new RealNumber(3.3);
    System.out.println(a.add(b));
    System.out.println(a.multiply(b));
    System.out.println(a.subtract(b));
    System.out.println(a.divide(b));
    RationalNumber c = new RationalNumber(1, 4);
    RationalNumber d = new RationalNumber(1, 2);
    System.out.println(d.add(c));
    System.out.println(d.multiply(c));
    System.out.println(d.subtract(c));
    System.out.println(d.divide(c));
  }
}
