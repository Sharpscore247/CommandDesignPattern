package CommandDesignPattern;

/**
 * @author Tyron Schultz
 *
 *         Class to map different key words to commands
 *
 */
import java.util.*;

public class InputHandler {

  private HashMap<String, Command> commands = new HashMap();

  /**
   * Constructor that populates the HashMap with the commands you are going to use
   * 
   * @param The document that you are working with
   * 
   */

  public InputHandler(Document doc) {
    Command LoadCommand = new LoadCommand(doc);
    Command SaveCommand = new SaveCommand(doc);
    Command SpellCommand = new SpellCommand(doc);
    Command PrintCommand = new PrintCommand(doc);

    commands.put("load", LoadCommand);
    commands.put("save", SaveCommand);
    commands.put("spell", SpellCommand);
    commands.put("print", PrintCommand);
  }

  /**
   * method that calls the command you input on the doc
   * 
   * @param the command you're calling
   */
  public void inputEntered(String data) {
    if (commands.containsKey(data)) {
      commands.get(data).execute();
    } else {
      System.out.println("Sorry, we don't recognize that command");
    }
  }
}
