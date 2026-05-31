
package librarycentre_package;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SimpleLibraryManagerTest {
    
    private SimpleLibraryManager mySystem;
    
    public SimpleLibraryManagerTest() {
    }
    
    @BeforeEach
    public void setUp() {
        mySystem = new SimpleLibraryManager(3);
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    /**
     * Test of addItemToList method, of class SimpleLibraryManager.
     */
    @Test
    public void testAddItemToList() {
        
        //adding a book
        
        Book book1 = new Book ("Big Java", "A-123");
        book1.setAuthor("Smith");
        book1.setPublicationYear(1999);
        
        mySystem.addItemToList(book1);
        
        assertEquals(book1, mySystem.itemList.get(0));
        
        assertEquals(1, mySystem.itemList.size());
        
        // adding a DVD
        
        DVD dvd1 = new DVD("The universe", "B-123");
        dvd1.setPublicationYear(2020);
        dvd1.setDirector("Paul Smith");
        dvd1.setGenre("Science");
        
         mySystem.addItemToList(dvd1);
        
        assertEquals(dvd1, mySystem.itemList.get(1));
        
        assertEquals(2, mySystem.itemList.size());
        
        
        
    }

    
}
