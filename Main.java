package Adventure;

//imports java.util
import java.util.Scanner;
import java.util.ArrayList;
//import from my package
import Adventure.Player;
import Adventure.Location;
import Adventure.Commands;

public class Main{

  public static void main (String[] args){
    //Game initialization
    System.out.println("Hello There");
    Scanner userInput = new Scanner(System.in);
    String newName = userInput.nextLine();
    Commands commandLine = new Commands(newName);
    // Player playerCharacter = new Player(newName);
    System.out.println("Your name is: " + commandLine.playerCharacter.name);
    commandLine.SayHelp();
    commandLine.Desc();
    commandLine.HandleCommand();

    //Method Tests
    // System.out.println("Testing Methods");
    // commandLine.playerCharacter.DamagePlayer(4);
    // commandLine.playerCharacter.HealPlayer(2);
    // System.out.println(commandLine.playerCharacter.GetHealth());
    // System.out.println(commandLine.playerCharacter.DoDamage());
    // commandLine.playerCharacter.ChangeDamage(7);
    // System.out.println(commandLine.playerCharacter.DoDamage());
  }
}
