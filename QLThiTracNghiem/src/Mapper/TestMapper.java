/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper;

import Model.Test;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mrloc
 */
public class TestMapper implements IMapper<Test>{

    @Override
    public Test mapRowToObject(ResultSet rs) {
        try{
            Test test = new Test();
            test.setTest_ID(rs.getInt("Test_ID"));
            test.setTest_Name(rs.getString("Test_Name"));
            test.setTime(rs.getInt("Time"));
            test.setLevel_ID(rs.getInt("Level_ID"));
            test.setStatus(rs.getBoolean("Status"));
            return test;
        }catch(SQLException e){
            return null;
        }
    }
    
}
