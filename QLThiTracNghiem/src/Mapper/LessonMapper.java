/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper;

import Model.Lesson;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mrloc
 */
public class LessonMapper implements IMapper<Lesson>{

    @Override
    public Lesson mapRowToObject(ResultSet rs) {
        try{
            Lesson lesson = new Lesson();
            lesson.setLesson_ID(rs.getInt("Lesson_ID"));
            lesson.setLesson(rs.getInt("Lesson"));
            lesson.setLesson_Name(rs.getString("Lesson_Name"));
            lesson.setChapter_ID(rs.getInt("Chapter_ID"));
            return lesson;
        }catch(SQLException e){
            return null;
        }
    }
    
}
