public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the getDenominator() is 0, make the fraction 0/1 instead
  *@param nume the getNumerator()
  *@param deno the getDenominator()
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    numerator = nume;
    denominator = deno;
    if (deno == 0){
      denominator = 1;
      numerator = 0;
    }
  }

  public double getValue(){
    return (getNumerator() * 1.0) / getDenominator();
  }

  /**
  *@return the getNumerator()
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the getDenominator()
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same getNumerator()
  *and getDenominator() as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    return new RationalNumber(getDenominator(), getNumerator());
  }
  /**
  *@return true when the RationalNumbers have the same getNumerator()s and getDenominator()s, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return getNumerator() == other.getNumerator() && getDenominator() == other.getDenominator();
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    return numerator + "/" + denominator;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    //http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
    int A = a;
    int B = b;
    int r;
    if (a == 0){
      return b;
    }
    while (true){
      if (A < B){
        A = b;
        B = a;
      }
      r = A % B;
      if (r == 0){
        return B;
      }
      A = B;
      B = r;
    }
  }

  /**
  *Divide the getNumerator() and getDenominator() by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int a = gcd(getNumerator(), getDenominator());
    numerator = getNumerator() / a;
    denominator = getDenominator() / a;
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    int a = getNumerator() * other.getNumerator();
    int b = getDenominator() * other.getDenominator();
    RationalNumber c = new RationalNumber(a, b);
    c.reduce();
    return c;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    int a = getNumerator() * other.getDenominator();
    int b = getDenominator() * other.getNumerator();
    RationalNumber c = new RationalNumber(a, b);
    c.reduce();
    return c;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int lcm = (getDenominator() * other.getDenominator())/ gcd(getDenominator(), other.getDenominator());
    int dm = lcm / getDenominator();
    int nm = getNumerator() * dm;
    int odm = lcm / other.getDenominator();
    int onm = other.getNumerator() * odm;
    RationalNumber c = new RationalNumber(nm + onm, lcm);
    c.reduce();
    return c;

  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int lcm = (getDenominator() * other.getDenominator())/ gcd(getDenominator(), other.getDenominator());
    int dm = lcm / getDenominator();
    int nm = getNumerator() * dm;
    int odm = lcm / other.getDenominator();
    int onm = other.getNumerator() * odm;
    RationalNumber c = new RationalNumber(nm - onm, lcm);
    c.reduce();
    return c;
  }
}
