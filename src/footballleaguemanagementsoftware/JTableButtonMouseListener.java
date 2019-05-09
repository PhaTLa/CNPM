/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballleaguemanagementsoftware;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

/**
 *
 * @author ADMIN
 */
public class JTableButtonMouseListener extends MouseAdapter{
    private final JTable table;

        public JTableButtonMouseListener(JTable table) {
            this.table = table;
        }

        public void mouseClicked(MouseEvent e) {
            int column = table.getColumnModel().getColumnIndexAtX(e.getX()); 
            int row    = e.getY()/table.getRowHeight();
            if (row < table.getRowCount() && row >= 0 && column < table.getColumnCount() && column >= 0) {
                Object value = table.getValueAt(row, column);
                if (value.equals("")) {
                    new ViewClubDetail(table.getModel().getValueAt(row, 1).toString());
                    
                }
            }
        }
}
