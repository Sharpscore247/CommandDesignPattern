package CommandDesignPattern;
/**
 * @author Tyron Schultz
 *
 * Class to map different key words to commands
 *
 */
import java.util.*;

public class InputHandler {

  private HashMap<String, Command> map = new HashMap();

  public InputHandler(Document doc) {
	Command LoadCommand = new LoadCommand;
	Command SaveCommand = new SaveCommand;
	Command Spell = new LoadCommand;
	Command LoadCommand = new LoadCommand;
    map.put("load", LoadCommand);
    map.put("save", SaveCommand(doc));
    map.put("spell", SpellCheckCommand(doc));
    map.put("print", PrintCommand(doc));
  }
  
  public void inputEntered(String data) {
	  
  }
}
