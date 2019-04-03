package Adventure;

import java.util.Scanner;
import Adventure.Player;
import Adventure.Location;

public class Commands{

  public static Player playerCharacter;
  public static Location[] gameLocations = {
    new Location("Entry-Hall", "A hub to other rooms", 0),
    new Location("Storage-Room", "An Empty Room", 1),
    new Location("Goblin-Room", "A cave like room where a goblin attacks", 2),
    new Location("Ghoul-Room", "An old kitchen that's haunted by a ghoul", 3),
    new Location("Treasure-Room", "An old treasure vault with some good loot", 4),
  };
  public static Scanner userInput = new Scanner(System.in);

  public Commands(String newName){
    playerCharacter = new Player(newName);
  }

  public void HelpString(String cmd, String cDesc){
    System.out.println("Type: \"" + cmd + "\" to " + cDesc +".");
  }
  public void SayHelp(){
    HelpString("desc", "see where you are");
    HelpString("help", "see this menu");
    HelpString("move <direction>", "move in a specified direction");
    HelpString("quit", "exit the game");
  }

  public void Desc(){
    System.out.println("You are in: " + gameLocations[playerCharacter.GetLocation()].name);
    System.out.println("Around you it is: " + gameLocations[playerCharacter.GetLocation()].description);
  }
  public void HandleCommand(){
    String command = userInput.nextLine();
    String cmd = command.toUpperCase();
    boolean quit = false;
    switch(cmd){
      case "DESC":
        Desc();
        break;
      case "HELP":
        SayHelp();
        break;
      case "MOVE NORTH":
        playerCharacter.MovePlayer(1);
        Desc();
        break;
      case "QUIT":
        quit = true;
        break;
      default:
        System.out.println("That is not a recognized command. Try typing \"help\"");
    }
    if(!quit){
      HandleCommand();
    }
  }
}
