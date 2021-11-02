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
    RationalNumber e = new RationalNumber(0, 4);
    RationalNumber f = new RationalNumber(1, 2);
    System.out.println(d.add(c));
    System.out.println(d.multiply(c));
    System.out.println(d.subtract(c));
    System.out.println(d.divide(c));
    System.out.println(e.add(f));
    System.out.println(e.multiply(f));
    System.out.println(e.subtract(f));
    System.out.println(e.divide(f));
  }
}
