public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int initialCapacity){
    super(initialCapacity);
  }
  private int whereToPlace(T value){
      /*return the index that the value should be placed
      when inserting into the OrderedArrayList .*/
      if (value == null){
        throw new IllegalArgumentException("null");
      }
      for (int i = 0; i < size(); i++){
        if (value.compareTo(get(i)) < 0){
          return i;
        }
      }
      return size();
    }
  public T set(int a, T b){
    T value = get(a);
    remove(a);
    super.add(whereToPlace(b), b);
    return value;
  }
  public boolean add(T b){
    super.add(whereToPlace(b), b);
    return true;
  }
  public void add(int a, T b){
    add(b);
  }
}
