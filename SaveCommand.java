package CommandDesignPattern;

/**
 * 
 * @author Miles This class handles saving the command
 */


public class SaveCommand implements Command {
  private Document doc;

  /**
   * Creates a document object
   * 
   * @param doc
   * 
   */
  public SaveCommand(Document doc) {
    this.doc = doc;
  }


  /**
   * Executes the save command
   */
  public void execute() {
    doc.save();
  }

}
