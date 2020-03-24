package CommandDesignPattern;
/**
 * This class is for the print command
 * @author Bekah
 *
 */
public class PrintCommand implements Command {
	private Document doc;
	/**
	 *  This method is a constructor
	 * @param doc
	 */
    public PrintCommand(Document doc) {
		this.doc = doc;
	}
	/**
	 * This method executes the spell command
	 */
	public void execute() {
		doc.print();
	}
}
