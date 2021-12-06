/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Lesson;
import java.util.List;

/**
 *
 * @author mrloc
 */
public interface ILessonDAO extends IGenericDAO<Lesson>{
    List<Lesson> findByChapterID(int Chapter_ID);
    Lesson findByLessonAndChapterID(int lesson, int chapter_ID);
    Lesson add(Lesson lesson);
    Lesson findByID(int lesson_ID);
    Boolean updateLessonNameByID(Lesson lesson);
    Boolean deleteByID(int lesson_ID);
}
