package Adventure;

import Adventure.Location;

public class AllLocations{
  public static Location[] gameLocations = {
    new Location("Entry-Hall", "A hub to other rooms", 0, 1, 2, 3, 4),
    new Location("Storage-Room", "An Empty Room", 1, -1, -1, 0, -1),
    new Location("Goblin-Room", "A cave like room where a goblin attacks", 2, -1, -1, -1, 0),
    new Location("Ghoul-Room", "An old kitchen that's haunted by a ghoul", 3, 0, -1, -1, -1),
    new Location("Treasure-Room", "An old treasure vault with some good loot", 4, -1, 0, -1, -1),
  };
}
