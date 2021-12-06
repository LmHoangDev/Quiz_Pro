/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implement;

import DAO.ITest_QuestionDAO;
import Mapper.Test_QuestionMapper;
import Model.Test_Question;
import java.util.List;

/**
 *
 * @author mrloc
 */
public class Test_QuestionDAO extends CommonDAO<Test_Question> implements ITest_QuestionDAO{

    @Override
    public List<Test_Question> findByTestID(int Test_ID) {
        String sql = "Select * from dbo.Test_Question where Test_ID = ?";
        return excute(sql, new Test_QuestionMapper(), Test_ID);
    }

    @Override
    public int getNumberOfQuestion(int Test_ID) {
        String sql = "Select * from dbo.Test_Question where Test_ID = ?";
        List<Test_Question> list = excute(sql, new Test_QuestionMapper(), Test_ID);
        return list.size();
    }

    @Override
    public Integer add(Test_Question test_Question) {
        String sql = "Insert into dbo.Test_Question values(?,?)";
        return insert(sql, test_Question.getTest_ID(),test_Question.getQuestion_ID());
    }
    
}
