package Adventure;

import Adventure.AllLocations;

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
  public void MovePlayer(String direction){
    switch(direction){
      case "NORTH":
        if(AllLocations.gameLocations[locationId].locationConnections.get(0) != -1){
          locationId = AllLocations.gameLocations[locationId].locationConnections.get(0);
        }
        else{
          System.out.println("You cannot go that way!");
        }
        break;
      case "EAST":
        if(AllLocations.gameLocations[locationId].locationConnections.get(1) != -1){
          locationId = AllLocations.gameLocations[locationId].locationConnections.get(1);
        }
        else{
          System.out.println("You cannot go that way!");
        }
        break;
      case "SOUTH":
        if(AllLocations.gameLocations[locationId].locationConnections.get(2) != -1){
          locationId = AllLocations.gameLocations[locationId].locationConnections.get(2);
        }
        else{
          System.out.println("You cannot go that way!");
        }
        break;
      case "WEST":
        if(AllLocations.gameLocations[locationId].locationConnections.get(3) != -1){
          locationId = AllLocations.gameLocations[locationId].locationConnections.get(3);
        }
        else{
          System.out.println("You cannot go that way!");
        }
        break;
    }
    // locationId = newLocation;
  }

  public void CheckDirections(){
    if(AllLocations.gameLocations[locationId].locationConnections.get(0) != -1){
      System.out.println("There is a passage to the North");
    }
    if(AllLocations.gameLocations[locationId].locationConnections.get(1) != -1){
      System.out.println("There is a passage to the East");
    }
    if(AllLocations.gameLocations[locationId].locationConnections.get(2) != -1){
      System.out.println("There is a passage to the South");
    }
    if(AllLocations.gameLocations[locationId].locationConnections.get(3) != -1){
      System.out.println("There is a passage to the West");
    }
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
