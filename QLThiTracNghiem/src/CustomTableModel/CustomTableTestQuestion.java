/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomTableModel;

import Model.Question;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author BINHBILL
 */
public class CustomTableTestQuestion extends AbstractTableModel {

    private String header[] = {"STT", "Câu hỏi"};
    private Class classes[] = {Integer.class,String.class};
    private ArrayList<Question> list = new ArrayList<Question>();

    public CustomTableTestQuestion(ArrayList<Question> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return rowIndex+1;
            case 1:
                return list.get(rowIndex).getQuestion();
            default:
                return null;
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }
}
