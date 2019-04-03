package Adventure;

//imports java.util
import java.util.Scanner;
import java.util.ArrayList;
//import from my package
import Adventure.Player;
import Adventure.Location;

public class Main{

  public static void main (String[] args){
    //Game initialization
    System.out.println("Hello There");
    Location[] gameLocations = {
      new Location("Entry-Hall", "A hub to other rooms", 0),
      new Location("Storage-Room", "An Empty Room", 1),
    };
    Scanner userInput = new Scanner(System.in);
    String newName = userInput.nextLine();
    Player playerCharacter = new Player(newName);
    System.out.println("Your name is: " + playerCharacter.name);

    //Method Tests
    playerCharacter.DamagePlayer(4);
    playerCharacter.HealPlayer(2);
    System.out.println(playerCharacter.GetHealth());
    System.out.println(playerCharacter.DoDamage());
    playerCharacter.ChangeDamage(7);
    System.out.println(playerCharacter.DoDamage());
  }
}
