public class Wizard extends Adventurer{
  private int mana;
  private String incantation;

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
  public void attack(Damageable other){
    int damage = 10 + (int)(Math.random()*16);
    if(getMana() >= 10){
      setMana(getMana() - 10);
      if(((int)(Math.random()*10) + 1) <= 3){
        System.out.println("Oops! " + this +" tripped on a rock!");
      } else {
        other.applyDamage(damage);
        System.out.println(this + " casts a spell using 10 mana to deal " + damage + " damage!");
      }
    } else {
      other.applyDamage(damage/4);
      int self = (int)(Math.random()*(damage/4 + 1)) + 1;
      applyDamage(self);
      System.out.println(this + " has run out of mana! " + this + " uses black magic and sacrifices " + self + " HP to deal " + damage/4 +" damage!");
    }
  }
  public void specialAttack(Damageable other){
    setMana(getMana() + 15);
    System.out.println("\"" + incantation + "\". " + this + " recites an incantation to restore 15 mana and attacks!");

    attack(other);
  }
}
