/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Answer;
import java.util.List;

/**
 *
 * @author mrloc
 */
public interface IAnswerDAO extends IGenericDAO<Answer>{
    List<Answer> getListAnswerByQuestionID(int Question_ID);
    Boolean add(Answer answer);
    Boolean updateAnswer(Answer answer);
}
