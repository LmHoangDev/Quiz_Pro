/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Test_Question;
import java.util.List;

/**
 *
 * @author mrloc
 */
public interface ITest_QuestionDAO extends IGenericDAO<Test_Question>{
    List<Test_Question> findByTestID(int Test_ID);
    int getNumberOfQuestion(int Test_ID);
    Integer add(Test_Question test_Question);
}
