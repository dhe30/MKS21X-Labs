public class Tester{
  public static void print(SuperArray a){
    for (int i = 0; i < a.size(); i++){
      System.out.println(a.get(i));
    }
  }
  public static void setPrint(SuperArray a, String str){
    for (int i = 0; i < a.size(); i++){
      a.set(i, str);
    }
  }
  public static void nope(SuperArray a){
    for (int i = 0; i < a.size(); i++){
      if (i == a.size() - 1){
        a.set(i, "NOPE!");
      } else {
      a.set(i, a.get(i + 1));
      }
    }
  }
  public static void main(String[] args){
    SuperArray a = new SuperArray();
    a.add("yes");
    System.out.println(a);
    System.out.println(a.toStringDebug());
    System.out.println(a.get(0));

    SuperArray alist = new SuperArray();
    alist.add("Mario");
    //displaying elements
    System.out.println(alist);
    System.out.println(alist.toStringDebug());

    alist.add("Samus");
    //displaying elements
    System.out.println(alist);
    System.out.println(alist.toStringDebug());

    alist.add("Ash");
    alist.add("Link");
    alist.add("Kirby");
    //displaying elements
    System.out.println(alist);
    System.out.println(alist.toStringDebug());
    //setPrint(alist, "yes");
    //nope(alist);
    //print(alist);
    SuperArray b = new SuperArray(0);
    b.add("yes");
    System.out.println(b);
    System.out.println(b.toStringDebug());
    alist.add(1, "yes");
    System.out.println(alist);
    System.out.println(alist.size());
    alist.remove(1);
    System.out.println(alist);
    System.out.println(alist.size());
    alist.remove("Mari");
    System.out.println(alist);
    System.out.println(alist.size());
  }
}
