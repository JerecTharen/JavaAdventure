package Adventure;

//imports
import java.util.Scanner;
import Adventure.Player;

public class Main{
  public static void main (String[] args){
    //Game initialization
    System.out.println("Hello There");
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
