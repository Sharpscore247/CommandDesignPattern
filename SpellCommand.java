package CommandDesignPattern;
/**
 * This class is for the spell command
 * @author Bekah
 *
 */
public class SpellCommand implements Command {
	private Document doc;
	/**
	 * This method is a constructor 
	 * @param doc
	 */
	public SpellCommand(Document doc) {
		this.doc = doc;
	}
	/**
	 * This method executes the spell command
	 */
	public void execute() {
		doc.spell();
	}
	
}
