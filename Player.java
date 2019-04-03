package Adventure;

public class Player{
  //variable initialization
  public String name;
  private int health = 10;
  private int attackDmg = 3;
  private int locationId = 0;

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
  public void MovePlayer(int newLocation){
    locationId = newLocation;
  }

  //Getters
  public int GetHealth(){
    return health;
  }
  public int DoDamage(){
    return attackDmg;
  }
  public int GetLocation(){
    return locationId;
  }
}
