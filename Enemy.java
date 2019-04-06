package Adventure;

public class Enemy{

  public String name;
  protected int health;
  protected int attackDmg;
  public int locationId;
  public String desc;
  public int enemyId;
  public boolean alive = true;

  // public void Enemy(String enemyName, int hp, int dmg, int location, String description){
  // public void Enemy(){
  //   // name = enemyName;
  //   // health = hp;
  //   // attackDmg = dmg;
  //   // locationId = location;
  //   // desc = description;
  // }

  public int doDamage(){
    return attackDmg;
  }

  public void takeDamage(int dmg){
    health -= dmg;
    if(health <= 0){
      alive = false;
    }
  }
}
