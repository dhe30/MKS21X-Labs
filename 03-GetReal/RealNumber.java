public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  /*
  *Return the sum of this and the other
  */
  public double add(RealNumber other){
    return (getValue() + other.getValue());
     //other can be ANY RealNumber, including a RationalNumber

     //or other subclasses of RealNumber (that aren't written yet)
  }

  /*
  *Return the product of this and the other
  */
  public double multiply(RealNumber other){
    return getValue() * other.getValue();
  }

  /*
  *Return the this divided by the other
  */
  public double divide(RealNumber other){
    return getValue() / other.getValue();
  }

  /*
  *Return the this minus the other
  */
  public double subtract(RealNumber other){
    return getValue() - other.getValue();
  }


  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+value;
  }

  public int compareTo(RealNumber a){
    if (getValue() > a.getValue()){
      return 1;
    }
    if (getValue() < a.getValue()){
      return -1;
    }
      return 0;
  }

  public boolean equals(RealNumber other){
    if (other == null){
      return false;
    }
    return (getValue() == other.getValue());
  }
}
