public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
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
    return (numerator * 0.0) / denominator;
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    return new RationalNumber(denominator, numerator);
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return numerator == other.numerator && denominator == other.denominator;
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
      return 1;
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
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int a = gcd(numerator, denominator);
    numerator = numerator / a;
    denominator = denominator / a;
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    int a = numerator * other.numerator;
    int b = denominator * other.denominator;
    RationalNumber c = new RationalNumber(a, b);
    c.reduce();
    return c;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    int a = numerator * other.denominator;
    int b = denominator * other.numerator;
    RationalNumber c = new RationalNumber(a, b);
    c.reduce();
    return c;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int lcm = (denominator * other.denominator)/ gcd(denominator, other.denominator);
    int dm = lcm / denominator;
    int nm = numerator * dm;
    int odm = lcm / other.denominator;
    int onm = other.numerator * odm;
    RationalNumber c = new RationalNumber(nm + onm, lcm);
    c.reduce();
    return c;

  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int lcm = (denominator * other.denominator)/ gcd(denominator, other.denominator);
    int dm = lcm / denominator;
    int nm = numerator * dm;
    int odm = lcm / other.denominator;
    int onm = other.numerator * odm;
    RationalNumber c = new RationalNumber(nm - onm, lcm);
    c.reduce();
    return c;
  }
}
