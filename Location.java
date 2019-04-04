package Adventure;

import java.util.ArrayList;

import java.util.ArrayList;
// import Adventure.Item;

public class Location{
  public String name;
  //array list of item in Location
  public String description;
  public ArrayList<Integer> locationConnections = new ArrayList<Integer>();
  public int locationId;

  public Location(String lName, String desc, int id, int north, int east, int south, int west){
    name = lName;
    description = desc;
    locationId = id;
    locationConnections.add(north);
    locationConnections.add(east);
    locationConnections.add(south);
    locationConnections.add(west);
  }
}
