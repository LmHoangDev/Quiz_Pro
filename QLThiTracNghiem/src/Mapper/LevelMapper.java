/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper;

import Model.Level;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mrloc
 */
public class LevelMapper implements IMapper<Level>{

    @Override
    public Level mapRowToObject(ResultSet rs) {
        try{
            Level level = new Level();
            level.setLevel_ID(rs.getInt("Level_ID"));
            level.setLevel_Name(rs.getString("Level_Name"));
            return level;
        }catch(SQLException e){
            return null;
        }
    }
    
}
