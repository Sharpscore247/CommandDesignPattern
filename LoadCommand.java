package CommandDesignPattern;
/**
 * 
 * @author Miles
 * This class handles loading the command
 */


public class LoadCommand implements Command {
  private Document doc;
  
  /**
   * Creates a document object
   * @param doc
   * 
   */
  public LoadCommand(Document doc) {
    this.doc = doc;
  }
  
  
  /**
   * Executes the load command
   */
  public void execute() {
    doc.load();
  }
  
}
