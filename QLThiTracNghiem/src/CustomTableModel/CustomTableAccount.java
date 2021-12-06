/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomTableModel;

import Model.Account;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mrloc
 */
public class CustomTableAccount extends AbstractTableModel{

    private String name[] = {"Tên đăng nhập","Họ và Tên","Trạng Thái"};
    private Class classes[] = {String.class,String.class,String.class};
    
    ArrayList<Account> listAccount = new ArrayList<>();

    public CustomTableAccount(ArrayList<Account> list) {
        listAccount = list;
    }

    public CustomTableAccount() {
    }
        
    @Override
    public int getRowCount() {
        return listAccount.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return listAccount.get(rowIndex).getUsername();
            case 1: return listAccount.get(rowIndex).getName();
            case 2: return listAccount.get(rowIndex).getStatusString();
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
