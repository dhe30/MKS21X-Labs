import java.util.*;
public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int initialCapacity){
    super(initialCapacity);
  }
  public T set(int a, T b){
    if (b==(null)){
      throw new IllegalArgumentException("null");
    } else {
      super.set(a, b);
    }
    return b;
  }
  public boolean add(T b){
    if (b==(null)){
      throw new IllegalArgumentException("null");
    } else {
      super.add(b);
    }
    return true;
  }
  public void add(int a, T b){
    if (b==(null)){
      throw new IllegalArgumentException("null");
    } else {
      super.add(a, b);
    }
  }
}
