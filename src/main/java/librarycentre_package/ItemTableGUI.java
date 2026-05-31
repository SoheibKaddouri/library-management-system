
package librarycentre_package;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class ItemTableGUI extends JFrame {
    
    JTable myTable;
    ItemTableModel tableModel;
    ArrayList<Item> itemList;
    
    // contructor
    public ItemTableGUI(ArrayList<Item> itemList){
        
        //set the title
        this.setTitle("Items in Library");
        
        // initialise and instantiate the instance variable 
        this.itemList = itemList;
        tableModel = new ItemTableModel(itemList);
        myTable =  new JTable(tableModel);
        
        // set the size of the frame 
        setBounds(20,20,800,600); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        // sorting
        myTable.setAutoCreateRowSorter(true);
      
        // add the table to the panle
        JScrollPane scrollPane = new JScrollPane(myTable); 
        scrollPane.setPreferredSize(new Dimension(380,280)); 

        // add a button on the bottom
        JButton button = new JButton("Info");
        
        // add the panel to the frame
        add(scrollPane,BorderLayout.CENTER); 
        add(button, BorderLayout.SOUTH);
        
        // add a listener to th button
        GUIListener handler =  new GUIListener();
        button.addActionListener(handler);
        
        
    }
    
    private class GUIListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent evt) {
          
          //get the numbers for each item group 
          int totBook = 0;
          int totDVD = 0;
          int totMagazine = 0;
          for (int i=0; i < itemList.size(); i++){
          
              if (itemList.get(i) instanceof Book)
                  totBook++;
              else if (itemList.get(i) instanceof DVD)
                  totDVD++;
              else if (itemList.get(i) instanceof Magazine)
                  totMagazine++;
          }
          
          JOptionPane.showMessageDialog(null, "Books: " + totBook + " , DVD: " + totDVD + ", Magazine: " + totMagazine);

          
      }
    }
}
              
    
          
          
          
          
          
      
  
        
    

