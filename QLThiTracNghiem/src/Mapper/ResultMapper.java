/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper;

import Model.Result;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mrloc
 */
public class ResultMapper implements IMapper<Result>{

    @Override
    public Result mapRowToObject(ResultSet rs) {
        try{
            Result result = new Result();
            result.setResult_ID(rs.getInt("Result_ID"));
            result.setAccount_ID(rs.getInt("Account_ID"));
            result.setTest_ID(rs.getInt("Test_ID"));
            result.setTime(rs.getInt("Time"));
            result.setCorrect_QT(rs.getInt("Correct_QT"));
            result.setResult_Date(rs.getDate("Result_Date"));
            result.setMark(rs.getFloat("Mark"));
            return result;
        }catch(SQLException e){
            return null;
        }
    }
    
}
