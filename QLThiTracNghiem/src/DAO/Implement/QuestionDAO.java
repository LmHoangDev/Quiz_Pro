/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implement;

import DAO.IQuestionDAO;
import Mapper.QuestionMapper;
import Model.Question;
import java.util.List;

/**
 *
 * @author mrloc
 */
public class QuestionDAO extends CommonDAO<Question> implements IQuestionDAO {

    @Override
    public Question findByID(int Question_ID) {
        String sql = "Select * from dbo.Question where Question_ID = ?";
        List<Question> list = excute(sql, new QuestionMapper(), Question_ID);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public List<Question> getListQuestionByTestID(int Test_ID) {
        String sql = "EXEC STP_GetQuestionByIdTest ? ";
        return excute(sql, new QuestionMapper(), Test_ID);
    }

    @Override
    public List<Question> getRandomByChapterIDAndLevelID(int chapter_ID, int level_ID) {
        String sql = "select * from Lesson as L inner join Chapter as C on C.Chapter_ID = L.Chapter_ID"
                + " inner join Question as Q on L.Lesson_ID = Q.Lesson_ID"
                + " where C.Chapter_ID = ? and Q.Level_ID = ? ORDER BY NEWID()";
        return excute(sql, new QuestionMapper(), chapter_ID, level_ID);
    }

    @Override
    public List<Question> getAllQuestion() {
        String sql = "Select * from dbo.Question";
        return excute(sql, new QuestionMapper());
    }

    @Override
    public List<Question> getQuestionsByChapterID(int chapterID) {
        String sql = "EXEC STP_GetListQuestionByChapter ?";
        return excute(sql, new QuestionMapper(), chapterID);
    }

    @Override
    public List<Question> getQuestionsByChapterIDAndLevelID(int chapteID, int levelID) {
        String sql = "EXEC STP_GetListQuestionByChapterAndLevel ?,?";
        return excute(sql, new QuestionMapper(), chapteID, levelID);
    }

    @Override
    public List<Question> getQuestionByLevelID(int levelID) {
        String sql = "Select * from dbo.Question where Level_ID = ?";
        return excute(sql, new QuestionMapper(), levelID);
    }

    @Override
    public List<Question> getQuestionByLessonID(int lesson_ID) {
        String sql = "Select * from dbo.Question where Lesson_ID = ?";
        return excute(sql, new QuestionMapper(), lesson_ID);
    }

    @Override
    public List<Question> getQuestionByLessonIDAndLevelID(int lesson_ID, int level_ID) {
        String sql = "Select * from dbo.Question where Lesson_ID = ? And Level_ID = ?";
        return excute(sql, new QuestionMapper(), lesson_ID, level_ID);
    }

    @Override
    public Question add(Question question) {
        String sql = "Insert into dbo.Question values(?,?,?)";
        int id = insert(sql, question.getQuestion(),question.getLevel_ID(),question.getLesson_ID());
        return findByID(id);
    }

    @Override
    public Boolean updateQuestion(Question question) {
        String sql = "Update dbo.Question set Question = ?, Level_ID = ?, Lesson_ID = ? where Question_ID = ?";
        return update(sql, question.getQuestion(),question.getLevel_ID(),question.getLesson_ID(),question.getQuestion_ID());
    }

    @Override
    public Boolean deleteQuestion(int question_ID) {
        String sql = "Delete from dbo.Question where Question_ID = ?";
        return update(sql, question_ID);
    }
}
