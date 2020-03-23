package CommandDesignPattern;
/**
 * The Document class holds all the functionality for 
 * a written document
 * @author Ian McDowell 2020
 *
 */
public class Document {
	private String name;
	
	/**
	 * Used to make a new Document
	 * @param name The title of the document
	 */
	public Document(String name) {
		this.name = name;
		System.out.println("Document named " + this.name + " is created");
	}
	
	/**
	 * Used to load the Document
	 */
	public void load() {
		System.out.println("Document " + this.name + " is loaded into view");
	}
	
	/**
	 * Used to check spelling of the Document
	 */
	public void spell() {
		System.out.println("Document " + this.name + " is being checked for spelling errors");
	}
	
	/**
	 * Used to save the Document
	 */
	public void save() {
		System.out.println("Document " + this.name + " is being saved ...");
	}
	
	/**
	 * Used to print the Document
	 */
	public void print() {
		System.out.println("Document " + this.name + " is printing ...");
	}
}
