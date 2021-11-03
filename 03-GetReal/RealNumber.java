public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  /*
  *Return the sum of this and the other
  */
  public double add(RealNumber other){
    return (value + other.value);
     //other can be ANY RealNumber, including a RationalNumber

     //or other subclasses of RealNumber (that aren't written yet)
  }

  /*
  *Return the product of this and the other
  */
  public double multiply(RealNumber other){
    return value * other.value;
  }

  /*
  *Return the this divided by the other
  */
  public double divide(RealNumber other){
    return value / other.value;
  }

  /*
  *Return the this minus the other
  */
  public double subtract(RealNumber other){
    return value - other.value;
  }


  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+value;
  }

  public int compareTo(RealNumber a){
    if (value > a.getValue()){
      return 1;
    }
    if (value < a.getValue()){
      return -1;
    }
    if (value == a.getValue()){
      return 0;
    }
  }

  public static boolean closeEnough(double a, double b){
    if (a == 0 && b == 0){
      return true;
    }
    return (Math.abs(a - b)/a)*100.0 <= 0.001;
  }

  public boolean equals(RealNumber other){
    if (other == null){
      return false;
    }
    return (closeEnough(value, other.getValue());
  }
}
