/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomTableModel;

import DAO.Implement.AccountDAO;
import DAO.Implement.TestDAO;
import Model.Result;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mrloc
 */
public class CustomTableResult extends AbstractTableModel{
    private String header[] = {"Tài khoản", "Họ tên", "Đề", "Thời gian","Số câu đúng","Ngày","Điểm"};
    private Class classes[] = {String.class, String.class, String.class, String.class,String.class,String.class,String.class};
    
    ArrayList<Result> listResult = new ArrayList<>();

    public CustomTableResult(ArrayList<Result> list) {
        this.listResult = list;
    }

    public CustomTableResult() {
    }
    
    AccountDAO accountDAO = new AccountDAO();
    TestDAO testDAO = new TestDAO();
    
    @Override
    public int getRowCount() {
        return listResult.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return accountDAO.findByID(listResult.get(rowIndex).getAccount_ID()).getUsername().trim();
            case 1:
                return accountDAO.findByID(listResult.get(rowIndex).getAccount_ID()).getName();
            case 2:
                return testDAO.findByTestID(listResult.get(rowIndex).getTest_ID()).getTest_Name();
            case 3:
                return listResult.get(rowIndex).getTime();
            case 4:
                return listResult.get(rowIndex).getCorrect_QT();
            case 5:
                return listResult.get(rowIndex).getResult_Date();
            case 6:
                return listResult.get(rowIndex).getMark();
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
