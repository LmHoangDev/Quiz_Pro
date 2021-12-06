/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implement;

import DAO.IChapterDAO;
import Mapper.ChapterMapper;
import Model.Chapter;
import Model.Question;
import java.util.List;

/**
 *
 * @author mrloc
 */
public class ChapterDAO extends CommonDAO<Chapter> implements IChapterDAO{

    @Override
    public List<Chapter> getAllChapter() {
        String sql = "Select * from dbo.Chapter order by Chapter";
        return excute(sql, new ChapterMapper());
    }

    @Override
    public Chapter findByChapter(int chapter) {
        String sql = "Select * from dbo.Chapter where Chapter = ?";
        List<Chapter> list = excute(sql, new ChapterMapper(), chapter);
        return list.isEmpty()? null : list.get(0);
    }

    @Override
    public Chapter add(Chapter chapter) {
        String sql = "Insert into dbo.Chapter values(?,?)";
        int insertedID = insert(sql, chapter.getChapter(),chapter.getChapter_Name());
        return findByID(insertedID);
    }

    @Override
    public Chapter findByID(int chapter_ID) {
        String sql = "Select * from dbo.Chapter where Chapter_ID = ?";
        List<Chapter> list = excute(sql, new ChapterMapper(), chapter_ID);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public Boolean updateChapterNameByID(Chapter chapter) {
        String sql = "Update dbo.Chapter set Chapter_Name = ? where Chapter_ID = ?";
        return update(sql, chapter.getChapter_Name(),chapter.getChapter_ID());
    }

    @Override
    public Boolean deleteChapterByID(int chapter_ID) {
        String sql = "Delete from dbo.Chapter where Chapter_ID = ?";
        return update(sql, chapter_ID);
    }

    @Override
    public Chapter getChapterByTestID(int Test_ID) {
        String sql = "exec STP_GetChapterByTestID ?";
        List<Chapter> list = excute(sql, new ChapterMapper(), Test_ID);
        return list.isEmpty()? null : list.get(0);
    }

    @Override
    public Chapter getChapterByQuestion(Question qt) {
        String sql = "select * from dbo.Chapter where Chapter_ID = (Select Chapter_ID from dbo.Lesson where Lesson_ID = ?)";
        List<Chapter> list = excute(sql, new ChapterMapper(), qt.getLesson_ID());
        return list.isEmpty() ? null : list.get(0);
    }
}
