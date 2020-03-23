package CommandDesignPattern;
/**
 * @author Tyron Schultz
 *
 *         Class to map different key words to commands
 *
 */
import java.util.*;

public class InputHandler {

  private HashMap<String, Command> map = new HashMap();

  public inputHandler(Document doc) {
    map.put("load", LoadCommand());
    map.put("save", SaveCommand());
    map.put("spell", SpellCheckCommand());
    map.put("print", PrintCommand());
  }
}
