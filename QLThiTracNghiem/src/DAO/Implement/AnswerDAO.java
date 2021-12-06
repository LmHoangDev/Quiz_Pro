/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implement;

import DAO.IAnswerDAO;
import Mapper.AnswerMapper;
import Model.Answer;
import java.util.List;

/**
 *
 * @author mrloc
 */
public class AnswerDAO extends CommonDAO<Answer> implements IAnswerDAO{
    @Override
    public List<Answer> getListAnswerByQuestionID(int Question_ID){
        String sql = "Select * from dbo.Answer where Question_ID = ?";
        return excute(sql, new AnswerMapper(), Question_ID);
    }

    @Override
    public Boolean add(Answer answer) {
        String sql = "Insert into dbo.Answer values(?,?,?)";
        return insert(sql, answer.getAnswer(),answer.isCorrect(),answer.getQuestion_ID()) != null;
    }

    @Override
    public Boolean updateAnswer(Answer answer) {
        String sql = "Update dbo.Answer set Answer = ?, Correct = ? where Answer_ID = ?";
        return update(sql, answer.getAnswer(), answer.isCorrect(), answer.getAnswer_ID());
    }
}
