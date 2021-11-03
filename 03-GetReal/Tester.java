public class Tester{
  public static void main(String[] args){
    RealNumber a = new RealNumber(3.3);
    RealNumber b = new RealNumber(3.3);
    RealNumber eq = new RealNumber(0.333333);
    RationalNumber eq1 = new RationalNumber(1, 3);
    RealNumber eq2 = new RealNumber(0.0);
    RationalNumber eq3 = new RationalNumber(1, 0);
    RationalNumber a1 = new RationalNumber(33, 10);
    System.out.println(eq2.compareTo(eq3));
    System.out.println(eq2.equals(eq3));
    System.out.println("\n");
    System.out.println(eq.compareTo(eq1));
    System.out.println(eq.equals(eq1));
    System.out.println("\n");
    System.out.println(a.add(b));
    System.out.println(a.multiply(b));
    System.out.println(a.subtract(b));
    System.out.println(a.divide(b));
    //
    System.out.println("\n");
    System.out.println(a.add(a1));
    System.out.println(a.multiply(a1));
    System.out.println(a.subtract(a1));
    System.out.println(a.divide(a1));
    System.out.println(a1.getValue());
    System.out.println("\n");
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
    System.out.println(f.divide(e));
    RationalNumber f1 = new RationalNumber(49, 60);
    RationalNumber f2 = new RationalNumber(1, 60);
    System.out.println(f1.add(f2));
    System.out.println(f1.subtract(f2));
  }
}
