import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.text.JTextComponent;
import javax.swing.event.DocumentListener;

@SuppressWarnings("serial")
public class SearchGUI extends JFrame implements ActionListener {

    JButton SearchBtn = new JButton("Search");
    JTextField SearchBox = new JTextField();
    JLabel label = new JLabel("Enter your search term!");

    // define the table model and table for displaying search results
    TableClass tableModel = new TableClass(new Object[][]{}, new Object[]{"Column 1", "Column 2", "Column 3"});
    JTable table = new JTable(tableModel);


 // define the table model and table for displaying search results
// DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"Column 1", "Column 2", "Column 3"}, 0);
// JTable table = new JTable(tableModel);
//
//    
    
    
    public SearchGUI() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 50)); // set the layout manager

        label.setPreferredSize(new Dimension(200, 30));
        SearchBox.setPreferredSize(new Dimension(400, 30));
        SearchBtn.setPreferredSize(new Dimension(100, 30));

        add(label); // add the components to the JFrame
        add(SearchBox);
        add(SearchBtn);

        // add scroll pane for the table
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(1000, 600));
        add(scrollPane);

        setSize(1100, 900);
        setLocationRelativeTo(null); // centers the JFrame on the screen
        setTitle("My Text Data Search and Comparison Tool");
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("icon.png").getImage());
        setBackground(Color.WHITE);

        // add document listener to the text field for checking the textField empty validation.
        JTextComponent searchBox = (JTextComponent) SearchBox;
        searchBox.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                checkTextField();
            }

            public void removeUpdate(DocumentEvent e) {
                checkTextField();
            }

            public void changedUpdate(DocumentEvent e) {
                checkTextField();
            }

            private void checkTextField() {
                if (SearchBox.getText().isEmpty()) {
                    SearchBtn.setEnabled(false);
                } else {
                    SearchBtn.setEnabled(true);
                }
            }
        });

        // disable the button initially
        SearchBtn.setEnabled(false);
        SearchBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == SearchBtn) {
            if (!SearchBox.getText().isEmpty()) {
                String searchText = SearchBox.getText();
                System.out.println("TextBoxResult: " + searchText);

                // clear the table and add some example data
                tableModel.setRowCount(0);

                for(int i=1;i<=10;i++) {
                    tableModel.addRow(new Object[]{"Result "+i, "Data "+i, "Info "+i});
                }
            } else {
                System.out.println("TextBoxResult: Textbox is empty");
            }
        }
    }

    public static void main(String[] args) {
        new SearchGUI();
    }
}
