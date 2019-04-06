package Adventure;

import java.util.ArrayList;

import java.util.ArrayList;
import Adventure.Enemy;
import Adventure.Goblin;
// import Adventure.Item;

public class Location{
  public String name;
  //array list of item in Location
  public String description;
  public ArrayList<Integer> locationConnections = new ArrayList<Integer>();
  public ArrayList<Enemy> enemyList = new ArrayList<Enemy>();
  public int locationId;

  public Enemy createEnemy(int id, int location){
    switch(id){
      case 0:
        return new Goblin(location);
      default:
        return new Enemy();
    }
  }

  public Location(String lName, String desc, int id, int north, int east, int south, int west, int enemy){
    name = lName;
    description = desc;
    locationId = id;
    locationConnections.add(north);
    locationConnections.add(east);
    locationConnections.add(south);
    locationConnections.add(west);
  }
}
