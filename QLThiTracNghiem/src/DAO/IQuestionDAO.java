/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Question;
import java.util.List;

/**
 *
 * @author mrloc
 */
public interface IQuestionDAO extends IGenericDAO<Question>{
    Question findByID(int Question_ID);
    List<Question> getListQuestionByTestID(int Test_ID);
    List<Question> getRandomByChapterIDAndLevelID(int chapter_ID, int level_ID);
    List<Question> getAllQuestion();
    List<Question> getQuestionsByChapterID(int chapterID);
    List<Question> getQuestionsByChapterIDAndLevelID(int chapteID, int levelID);
    List<Question> getQuestionByLevelID(int levelID);
    List<Question> getQuestionByLessonID(int lesson_ID);
    List<Question> getQuestionByLessonIDAndLevelID(int lesson_ID,int level_ID);
    Question add(Question question);
    Boolean updateQuestion(Question question);
    Boolean deleteQuestion(int question_ID);
}
