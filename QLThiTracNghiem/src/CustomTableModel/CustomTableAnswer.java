/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomTableModel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mrloc
 */
public class CustomTableAnswer extends AbstractTableModel{
    private String name[] = {"Câu hỏi","Câu trả lời","Kết quả"};
    private Class classes[] = {String.class,String.class,String.class};
    
    ArrayList<AnswerTableModel> listAnswerTableModels = new ArrayList<>();

    public CustomTableAnswer(ArrayList<AnswerTableModel> list) {
        this.listAnswerTableModels = list;
    }

    public CustomTableAnswer() {
    }

    @Override
    public int getRowCount() {
        return listAnswerTableModels.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return listAnswerTableModels.get(rowIndex).getQuestion();
            case 1: return listAnswerTableModels.get(rowIndex).getAnswer();
            case 2: return listAnswerTableModels.get(rowIndex).getCorrect();
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
