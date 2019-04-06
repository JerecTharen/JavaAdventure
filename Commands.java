package Adventure;

import java.util.Scanner;
import Adventure.Player;
import Adventure.Location;
import Adventure.AllLocations;

public class Commands{

  public static Player playerCharacter;

  public static Scanner userInput = new Scanner(System.in);

  public Commands(String newName){
    System.out.println("General Kenbobi!!");
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
    HelpString("directions", "know which directions you can go");
  }

  public void Desc(){
    System.out.println("You are in: " + AllLocations.gameLocations[playerCharacter.GetLocation()].name);
    System.out.println("Around you it is: " + AllLocations.gameLocations[playerCharacter.GetLocation()].description);
    playerCharacter.CheckDirections();
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
        playerCharacter.MovePlayer("NORTH");
        Desc();
        break;
      case "MOVE EAST":
        playerCharacter.MovePlayer("EAST");
        Desc();
        break;
      case "MOVE SOUTH":
        playerCharacter.MovePlayer("SOUTH");
        Desc();
        break;
      case "MOVE WEST":
        playerCharacter.MovePlayer("WEST");
        Desc();
        break;
      case "QUIT":
        quit = true;
        break;
      case "DIRECTIONS":
        playerCharacter.CheckDirections();
        break;
      default:
        System.out.println("That is not a recognized command. Try typing \"help\"");
    }
    if(!quit){
      HandleCommand();
    }
  }
}
