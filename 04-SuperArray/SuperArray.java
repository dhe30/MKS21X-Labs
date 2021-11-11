public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(int initialCapacity){
    if (initialCapacity < 0){
      throw new IllegalArgumentException("Illegal argument: " + initialCapacity);
    }
    size = 0;
    data = new String[size];
  }
  public SuperArray(){
    data = new String[10];
    size = 0;
  }
  public int size(){
    return size;
  }
  public boolean add(String str){
    if (size == data.length){
      resize();
    }
    data[size()] = str;
    size = size() + 1;
    return true;
  }
  public String toString(){
    String res = "[";
    if (size() == 0){
      return res + "]";
    }
    for (int i = 0; i < size(); i++){
      res = res + data[i] + ", ";
    }
    return res.substring(0, res.length() - 2) + "]";
  }
  public String toStringDebug(){
    String res = "[";
    if (size() == 0){
      return res + "]";
    }
    for (int i = 0; i < data.length; i++){
      res = res + data[i] + ", ";
    }
    return res.substring(0, res.length() - 2) + "]";
  }
  public String get(int index){
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException ("Index out of bounds: " + index);
    }
    return data[index];
  }
  public String set(int index, String element){
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException ("Index out of bounds: " + index);
    }
    String hold = data[index];
    data[index] = element;
    return hold;
  }
  private void resize(){
    String[] a = new String[size()];
    for (int i = 0; i < size(); i++){
      a[i] = data[i];
    }
    data = new String[(size() * 2) + 1];
    for (int i = 0; i < size(); i++){
      data[i] = a[i];
    }
  }
  public int indexOf(String target){
    for (int i = 0; i < size(); i++){
      if (data[i] == target){
        return i;
      }
    }
    return -1;
  }
  public int lastIndexOf(String target){
    for (int i = size() - 1; i >= 0; i--){
      if (data[i] == target){
        return i;
      }
    }
    return -1;
  }
  public void add(int index,String value){
    if (index < 0 || index > size()){
      throw new IndexOutOfBoundsException ("Index out of bounds: " + index);
    }
    if (size() == data.length){
      resize();
      data[size()] = value;
    }

    String hold = data[index];
    data[index] = value;
    for (int i = size(); i > index; i--){
      if (i == index + 1){
        data[i] = hold;
      } else {data[i] = data[i - 1];
        }
    }
    size++;
  }
  public String remove(int index){
    if (index >= size() || index < 0){
      throw new IndexOutOfBoundsException ("Index out of bounds: " + index);
    }
    String hold = data[index];
    for (int i = index; i < size(); i++){
      data[i] = data[i + 1];
    }
    size--;
    return hold;
  }
  public boolean remove(String target){
    if (lastIndexOf(target) == -1){
      return false;
    }
    remove(lastIndexOf(target));
    return true;
  }
}
