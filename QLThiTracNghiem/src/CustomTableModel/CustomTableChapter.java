/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomTableModel;

import Model.Chapter;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mrloc
 */
public class CustomTableChapter extends AbstractTableModel{
    private String name[] = {"Chuơng","Tên Chương"};
    private Class classes[] = {String.class,String.class};
    
    ArrayList<Chapter> listChapter = new ArrayList<>();

    public CustomTableChapter(ArrayList<Chapter> list) {
        listChapter = list;
    }

    public CustomTableChapter() {
    }
        
    @Override
    public int getRowCount() {
        return listChapter.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return listChapter.get(rowIndex).getChapter();
            case 1: return listChapter.get(rowIndex).getChapter_Name();
            default: return null;
        }
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return name[column];
    }
}
