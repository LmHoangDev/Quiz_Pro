/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implement;

import DAO.ITestDAO;
import Mapper.TestMapper;
import Model.Test;
import java.util.List;

/**
 *
 * @author mrloc
 */
public class TestDAO extends CommonDAO<Test> implements ITestDAO {

    @Override
    public List<Test> getFullActiveTest() {
        String sql = "Select * from dbo.Test where Status = 1";
        return excute(sql, new TestMapper());
    }

    @Override
    public Test findByTestID(int Test_ID) {
        String sql = "Select * from dbo.Test where Test_ID = ?";
        List<Test> list = excute(sql, new TestMapper(), Test_ID);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public List<Test> getAllTest() {
        String sql = "Select * from dbo.Test";
        return excute(sql, new TestMapper());
    }

    @Override
    public Boolean changeTestStatusByID(int Test_ID) {
        String sql = "Update dbo.Test set Status = Abs(Status -1 ) where Test_ID = ?";
        return update(sql, Test_ID);
    }

    @Override
    public Test findByTestName(String test_Name) {
        String sql = "Select * from dbo.Test where TRIM(UPPER(Test_Name)) Like Trim(UPPER(?))";
        List<Test> list = excute(sql, new TestMapper(), test_Name);
        return list.isEmpty()? null : list.get(0);
    }

    @Override
    public Test add(Test test) {
        String sql = "Insert into dbo.Test values(?,?,?,?)";
        int insertedID = insert(sql, test.getTest_Name(),test.getTime(), test.getLevel_ID(),test.isStatus());
        return findByTestID(insertedID);
    }

    @Override
    public Boolean deleteByID(int Test_ID) {
        String sql = "Delete from dbo.Test where Test_ID = ?";
        return update(sql, Test_ID);
    }

    @Override
    public Boolean updateNameAndTimeByID(Test test) {
        String sql = "Update dbo.Test set Test_Name = ?, Time = ? where Test_ID = ?";
        return update(sql, test.getTest_Name(),test.getTime(),test.getTest_ID());
    }

}
