public class Wizard extends Adventurer{
  private int mana;
  private String incantation;
  private int manaMax;
  public Wizard(){
    this("Nick");
  }
  public Wizard(String name){
    this(name, "I love you", 20);
  }
  public Wizard(String name, String incantation, int mana){
    super(name,30+(int)(Math.random()*10));
    setMana(mana);
    setIncantation(incantation);
    manaMax = 30;
  }

  public String getSpecialName(){
            return "Mana";
          }
  public int getSpecialMax(){
            return manaMax;
          }
  public int getSpecial(){
            return mana;
          }
  public void setMana(int a){
    this.mana = a;
  }
  public void setIncantation(String a){
    this.incantation = a;
  }
  public int getMana(){
    return mana;
  }
  public String attack(Damageable other){
    int damage = 10 + (int)(Math.random()*16);
    if(getMana() >= 10){
      setMana(getMana() - 10);
      if(((int)(Math.random()*10) + 1) <= 3){
        return("Oops! " + this +" tripped on a rock!");
      } else {
        other.applyDamage(damage);
        return(this + " casts a spell using 10 mana dealing " + damage + " damage to " + other + "!");
      }
    } else {
      other.applyDamage(damage/4);
      int self = (int)(Math.random()*(damage/4 + 1)) + 1;
      applyDamage(self);
      return("No mana! " + this + " uses dark magic sacrificing " + self + " HP to deal " + damage/4 +" damage to " + other + "!");
    }

  }
  public String specialAttack(Damageable other){
    setMana(getMana() + 15);
    int currant = getmaxHP() - getHP();
    setHP(getmaxHP());
    String happy = ("\"" + incantation + "\". " + this + " recites an incantation to restore 15 mana and " + currant + " HP!");
    return happy;


  }
}
