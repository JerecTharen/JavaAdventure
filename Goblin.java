package Adventure;

import Adventure.Enemy;

public class Goblin extends Enemy{
  public void Goblin(int location){
    // super();
    name = "Goblin";
    health = 6;
    attackDmg = 2;
    locationId = location;
    desc = "A filthy little green beast";
    enemyId = 0;
  }
}
