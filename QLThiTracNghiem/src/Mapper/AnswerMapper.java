/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper;

import Model.Answer;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mrloc
 */
public class AnswerMapper implements IMapper<Answer>{

    @Override
    public Answer mapRowToObject(ResultSet rs) {
        try{
            Answer answer = new Answer();
            answer.setAnswer_ID(rs.getInt("Answer_ID"));
            answer.setAnswer(rs.getString("Answer"));
            answer.setCorrect(rs.getBoolean("Correct"));
            answer.setQuestion_ID(rs.getInt("Question_ID"));
            return answer;
        }catch(SQLException e){
            return null;
        }
    }
    
}
