import java.io.Console;

public class Madlips {
  public static void main(String[], args) {
    Console console = System.console();
    String name = console.readLine("Whats your name?  ");
    String noun1 = console.readLine("Whats your noun?  ");
    String noun2 = console.readLine("Whats your noun?  ");
    String noun3 = console.readLine("Whats your funny word?  ");
    console.printf("You can wave a %s's wand in the air and make it turn into a %s  All you have to do is memorize the secret magic word,'%s '", name, noun1, noun2, adjective, noun3);
  }
}