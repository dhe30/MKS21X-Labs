public class Kitty{
  private int age;
  private String name;
  public Kitty(String startName, int startAge){
    age = startAge;
    name = startName;
  }
  public Kitty(){
    age = 2;
    name = "Mittens";
  }
  public int getAge(){
    return age;
  }
  public String getName(){
    return name;
  }
  public changeName(String newName){
    name = newName;
  }
  public makeOlder(int newAge){
    age++;
  }
}
