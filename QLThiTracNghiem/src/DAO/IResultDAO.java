/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Result;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author mrloc
 */
public interface IResultDAO extends IGenericDAO<Result>{
    Integer add(Result result);
    Result findByResultID(Integer Result_ID);
    Result findByAccountIDAndTestID(int Account_ID, int Test_ID);
    List<Result> getListResultByDateAndUserName(Date date,String username);
    Boolean deleteResultByID(int Result_ID);
}
