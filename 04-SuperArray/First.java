public class First{
  private String[] data;
  private int size;
  public First(){
    data = new String[10];
    size = 0;
  }
  public int size(){
    return size;
  }
  public void add(String str){
    data[size()] = str;
    size = size() + 1;
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
  public static void main(String[] args){
    First a = new First();
    a.add("yes");
    System.out.println(a);
  }
}
