import javax.swing.table.DefaultTableModel;


@SuppressWarnings("serial")
public class TableClass extends DefaultTableModel {
    public TableClass(Object[][] data, Object[] columnNames) {
        super(data, columnNames);
    }

	    
	    @Override
	    public boolean isCellEditable(int row, int column) {
	        // disable cell editing
	        return false;
	    }
	    
	    
	    
}
