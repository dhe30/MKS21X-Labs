public class tester{
  public static void main(String[] args){
    try{
    NoNullArrayList<String> a = new NoNullArrayList<String>();
    a.add(0, null);
  } catch (IllegalArgumentException e){
    System.out.println("yes");
  }
    OrderedArrayList<Integer> b = new OrderedArrayList<Integer>();
    for (int i = 10; i >= 0; i--){
      b.add(i);
    }
    b.add(null);
    System.out.println(b);
  }
}
