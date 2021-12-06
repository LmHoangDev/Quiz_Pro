/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper;

import Model.Chapter;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mrloc
 */
public class ChapterMapper implements IMapper<Chapter>{

    @Override
    public Chapter mapRowToObject(ResultSet rs) {
        try{
            Chapter chapter = new Chapter();
            chapter.setChapter_ID(rs.getInt("Chapter_ID"));
            chapter.setChapter(rs.getInt("Chapter"));
            chapter.setChapter_Name(rs.getString("Chapter_Name"));
            return chapter;
        }catch(SQLException e){
            return null;
        }
    }
    
}
