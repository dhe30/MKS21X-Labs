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
        return(this + " casts a spell using 10 mana to deal " + damage + " damage!");
      }
    } else {
      other.applyDamage(damage/4);
      int self = (int)(Math.random()*(damage/4 + 1)) + 1;
      applyDamage(self);
      return(this + " has no mana! " + this + " uses black magic to sacrifice " + self + " HP to deal " + damage/4 +" damage!");
    }
    
  }
  public String specialAttack(Damageable other){
    setMana(getMana() + 15);
    String ness = attack(other);
    String happy = ("\"" + incantation + "\". " + this + " recites an incantation to restore 15 mana and attacks!");
    return happy + " " + ness;


  }
}
