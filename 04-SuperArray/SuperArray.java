public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(int initialCapacity){
    size = initialCapacity;
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
    data[size()] = str;
    size = size() + 1;
    return true;
  }
  public String toString(){
    String res = "[";
    for (int i = 0; i < size(); i++){
      res = res + data[i] + ", ";
    }
    return res.substring(0, res.length() - 2) + "]";
  }
  public String toStringDebug(){
    String res = "[";
    for (int i = 0; i < data.length; i++){
      res = res + data[i] + ", ";
    }
    return res.substring(0, res.length() - 2) + "]";
  }
  public String get(int index){
    if (index < 0 || index >= size()){
      System.out.println("error in get");
      return null;
    }
    return data[index];
  }
  public String set(int index, String element){
    if (index < 0 || index >= size()){
      System.out.println("error in set");
      return null;
    }
    String hold = data[index];
    data[index] = element;
    return hold;
  }
  
}
