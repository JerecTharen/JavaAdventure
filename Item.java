package Adventure;

public class Item{
  public String name;
  public int itemId;
  public int $value;
  public int locationId;
  public String effectDesc;
  //here will go whatever other info about the effect is needed

  public Item(String iName, int id, int value, int location, String effect){
    name = iName;
    itemId = id;
    $value = value;
    locationId = location;
    effectDesc = effect;
  }
}
