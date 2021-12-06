/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Test;
import java.util.List;

/**
 *
 * @author mrloc
 */
public interface ITestDAO extends IGenericDAO<Test>{
    List<Test> getFullActiveTest();
    Test findByTestID(int Test_ID);
    List<Test> getAllTest();
    Boolean changeTestStatusByID(int Test_ID);
    Test findByTestName(String test_Name);
    Test add(Test test);
    Boolean deleteByID(int Test_ID);
    Boolean updateNameAndTimeByID(Test test);
}
