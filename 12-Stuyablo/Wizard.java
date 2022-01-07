public class Wizard extends Adventurer{
  private int mana;
  private String incantation;

  public Wizard(){
    this("Nick");
  }
  public Wizard(String name){
    this(name, "I love you", 10);
  }
  public Wizard(String name, String incantation, int mana){
    super(name,30+(int)(Math.random()*10));
    setMana(mana);
    setIncantation(incantation);
  }
  public void setMana(int a){
    this.mana = a;
  }
  public void setIncantation(String a){
    this.incantation = a;
  }
}
