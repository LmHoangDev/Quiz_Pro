/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper;

import Model.Test_Question;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mrloc
 */
public class Test_QuestionMapper implements IMapper<Test_Question>{

    @Override
    public Test_Question mapRowToObject(ResultSet rs) {
        try{
            Test_Question test_Question = new Test_Question();
            test_Question.setT_QT_ID(rs.getInt("T_QT_ID"));
            test_Question.setTest_ID(rs.getInt("Test_ID"));
            test_Question.setQuestion_ID(rs.getInt("Question_ID"));
            return test_Question;
        }catch(SQLException e){
            return null;
        }
    }
}
