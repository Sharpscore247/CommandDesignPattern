package CommandDesignPattern;
/**
 * @author Tyron Schultz
 *
 *         Class to map different key words to commands
 *
 */
import java.util.*;

public class inputHandler {

  private HashMap<String, Command> map = new HashMap();

  public inputHandler(Document doc) {
    map.put("vishal", 10);
    map.put("sachin", 30);
    map.put("vaibhav", 20);
  }
}
