/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomTableModel;

import Model.Lesson;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mrloc
 */
public class CustomTableLesson extends AbstractTableModel{
    private String name[] = {"Bài","Tên Bài"};
    private Class classes[] = {String.class,String.class};
    
    ArrayList<Lesson> listLesson = new ArrayList<>();

    public CustomTableLesson(ArrayList<Lesson> list) {
        listLesson = list;
    }

    public CustomTableLesson() {
    }
        
    @Override
    public int getRowCount() {
        return listLesson.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return listLesson.get(rowIndex).getLesson();
            case 1: return listLesson.get(rowIndex).getLesson_Name();
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
