

package librarycentre_package;




public class LibraryCentre {

    public static void main(String[] args) {
        
       SimpleLibraryManager libraryCentre = new SimpleLibraryManager(5);
    
        boolean exit = false;
        
        //run the menu until the user select exit
        while (!exit)
            exit = libraryCentre.runMenu();
    }
}
