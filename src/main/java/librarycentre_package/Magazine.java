
package librarycentre_package;


public class Magazine extends Item {
    
    // instance variable - private to respect the encapsulation principle
    private String issueNumber ; //if you choose ti represent with an int it is ok
    private String publicationFrequency;
    private String editor;
    
    // constructor
    // takes title and ISBN as requested from specification
    public Magazine(String title, String ISBN) {
        super(title, ISBN);
    }
    
    // set get methods

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getPublicationFrequency() {
        return publicationFrequency;
    }

    public void setPublicationFrequency(String publicationFrequency) {
        this.publicationFrequency = publicationFrequency;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }
    
    // description
    @Override
    public String toString(){
        return super.toString() + " - issue number: " + issueNumber + ", publication frequency: " + publicationFrequency + ", editor: " + editor;
    }
    
    
    
}
