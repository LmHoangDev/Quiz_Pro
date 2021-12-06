/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implement;

import DAO.ILessonDAO;
import Mapper.LessonMapper;
import Model.Lesson;
import java.util.List;

/**
 *
 * @author mrloc
 */
public class LessonDAO extends CommonDAO<Lesson> implements ILessonDAO{

    @Override
    public List<Lesson> findByChapterID(int Chapter_ID) {
        String sql = "Select * from dbo.Lesson where Chapter_ID = ? order by Lesson";
        return excute(sql, new LessonMapper(), Chapter_ID);
    }

    @Override
    public Lesson findByLessonAndChapterID(int lesson, int chapter_ID) {
        String sql = "Select * from dbo.Lesson where Lesson = ? And Chapter_ID = ?";
        List<Lesson> list = excute(sql, new LessonMapper(), lesson,chapter_ID);
        return list.isEmpty()? null : list.get(0);
    }

    @Override
    public Lesson add(Lesson lesson) {
        String sql = "Insert into dbo.Lesson values(?,?,?)";
        int insertedID = insert(sql, lesson.getLesson(), lesson.getLesson_Name(),lesson.getChapter_ID());
        return findByID(insertedID);
    }

    @Override
    public Lesson findByID(int lesson_ID) {
        String sql = "Select * from dbo.Lesson where Lesson_ID = ?";
        List<Lesson> list = excute(sql, new LessonMapper(), lesson_ID);
        return list.isEmpty()? null : list.get(0);
    }

    @Override
    public Boolean updateLessonNameByID(Lesson lesson) {
        String sql = "Update dbo.Lesson set Lesson_Name = ? where Lesson_ID = ?";
        return update(sql, lesson.getLesson_Name(),lesson.getLesson_ID());
    }

    @Override
    public Boolean deleteByID(int lesson_ID) {
        String sql = "Delete from dbo.Lesson where Lesson_ID = ?";
        return update(sql, lesson_ID);
    }
    
}
