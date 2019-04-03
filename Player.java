package Adventure;

public class Player{
  //variable initialization
  public String name;
  private int health = 10;
  private int attackDmg = 3;
  //location variable will go here

  //Constructor
  Player(String enterName){
    //require name on new player instance
    name = enterName;
  }

  //Setters
  public void DamagePlayer(int dmg){
    health -= dmg;
    System.out.println(name + " took " + Integer.toString(dmg) + " damage!");
  }
  public void HealPlayer(int heal){
    health += heal;
    System.out.println(name + " healed " + Integer.toString(heal) + " damage!");
  }
  public void ChangeDamage(int amount){
    attackDmg = amount;
  }

  //Getters
  public int GetHealth(){
    return health;
  }
  public int DoDamage(){
    return attackDmg;
  }
}
