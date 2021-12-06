/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper;

import Model.Question;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mrloc
 */
public class QuestionMapper implements IMapper<Question>{

    @Override
    public Question mapRowToObject(ResultSet rs) {
        try{
            Question question = new Question();
            question.setQuestion_ID(rs.getInt("Question_ID"));
            question.setQuestion(rs.getString("Question"));
            question.setLevel_ID(rs.getInt("Level_ID"));
            question.setLesson_ID(rs.getInt("Lesson_ID"));
            return question;
        }catch(SQLException e){
            return null;
        }
    }
    
}
