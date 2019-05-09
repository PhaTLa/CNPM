/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballleaguemanagementsoftware;

import java.awt.Component;
import javafx.scene.paint.Color;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author ADMIN
 */
public class ButtonRenderer extends JButton implements TableCellRenderer{

    public ButtonRenderer() { 
    setOpaque(true); 
  } 
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (isSelected) { 
      setForeground(table.getSelectionForeground()); 
      setBackground(table.getSelectionBackground()); 
    } else{ 
      setForeground(table.getForeground()); 
      setBackground(UIManager.getColor(Color.GRAY)); 
    } 
    setText("Detail"); 
    return this; 
    }
    
}
