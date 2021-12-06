/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomTableModel;

import Model.Test;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author BINHBILL
 */
public class CustomTableTest extends AbstractTableModel {

    private String header[] = {"Tên đề","Thời gian", "Độ khó", "Trạng thái"};
    private Class classes[] = {String.class, Integer.class, Integer.class, String.class};
    private ArrayList<Test> listTest = new ArrayList<Test>();

    public CustomTableTest(ArrayList<Test> list) {
        this.listTest = list;
    }

    public CustomTableTest() {
    }

    @Override
    public int getRowCount() {
        return listTest.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listTest.get(rowIndex).getTest_Name();
            case 1:
                return listTest.get(rowIndex).getTime();
            case 2:
                switch (listTest.get(rowIndex).getLevel_ID()) {
                    case 1:
                        return "Dễ";
                    case 2:
                        return "TB";
                    case 3:
                        return "Khó";
                }
            case 3:
                if(listTest.get(rowIndex).isStatus())
                    return "Hoạt động";
                else
                    return "Vô hiệu hóa";
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
