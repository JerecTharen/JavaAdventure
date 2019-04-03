package Adventure;

import java.util.ArrayList;
// import Adventure.Item;

public class Location{
  public String name;
  //array list of item in Location
  public String description;
  //links to connected locations
  public int locationId;

  public Location(String lName, String desc, int id){
    name = lName;
    description = desc;
    locationId = id;
  }
}
