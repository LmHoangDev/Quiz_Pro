/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Chapter;
import Model.Question;
import java.util.List;

/**
 *
 * @author mrloc
 */
public interface IChapterDAO extends IGenericDAO<Chapter>{
    List<Chapter> getAllChapter();
    Chapter findByChapter(int chapter);
    Chapter add(Chapter chapter);
    Chapter findByID(int chapter_ID);
    Boolean updateChapterNameByID(Chapter chapter);
    Boolean deleteChapterByID(int chapter_ID);
    Chapter getChapterByTestID(int Test_ID);
    Chapter getChapterByQuestion(Question qt);
}
