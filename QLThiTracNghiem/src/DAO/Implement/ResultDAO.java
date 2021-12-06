/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implement;

import DAO.IResultDAO;
import Mapper.ResultMapper;
import Model.Result;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author mrloc
 */
public class ResultDAO extends CommonDAO<Result> implements IResultDAO {

    @Override
    public Integer add(Result result) {
        String sql = "Insert into dbo.Result values(?,?,?,?,?,?)";
        return insert(sql, result.getAccount_ID(), result.getTest_ID(), result.getTime(), result.getCorrect_QT(), result.getResult_Date(), result.getMark());
    }

    @Override
    public Result findByResultID(Integer Result_ID) {
        String sql = "Select * from dbo.Result where Result_ID = ?";
        List<Result> list = excute(sql, new ResultMapper(), Result_ID);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public Result findByAccountIDAndTestID(int Account_ID, int Test_ID) {
        String sql = "Select * from dbo.Result where Account_ID = ? And Test_ID = ?";
        List<Result> list = excute(sql, new ResultMapper(), Account_ID, Test_ID);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public List<Result> getListResultByDateAndUserName(Date date, String username) {
        String sql = "Select * from dbo.Result,dbo.Account where Result.Account_ID = Account.Account_ID ";
        if (date == null) {
            if (!username.trim().equals("")) {
                sql += " And UserName = ?";
                return excute(sql, new ResultMapper(), username);
            } else {
                return excute(sql, new ResultMapper());
            }
        } else {
            sql += " And Result_Date = ?";
            if (!username.trim().equals("")) {
                sql += " And UserName = ?";
                return excute(sql, new ResultMapper(), date, username);
            } else {
                return excute(sql, new ResultMapper(), date);
            }
        }

    }

    @Override
    public Boolean deleteResultByID(int Result_ID) {
        String sql = "Delete from dbo.Result where Result_ID = ?";
        return update(sql, Result_ID);
    }
}
