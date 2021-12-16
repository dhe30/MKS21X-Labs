public class NoNullArrayList<T> extends ArrayList<T> {
  private T value;
  private int initialCapacity
  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(initialCapacity){
    super(initialCapacity);
  }
  public T set(int a, String b){
    if (!indexOf(a).equals(null)){
      throw new IllegalArgumentException("");
    } else {
      super.set(a, b);
    }
  }
}
