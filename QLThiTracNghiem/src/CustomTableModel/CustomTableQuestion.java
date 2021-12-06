/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomTableModel;

import DAO.Implement.ChapterDAO;
import DAO.Implement.LessonDAO;
import DAO.Implement.LevelDAO;
import Model.Chapter;
import Model.Lesson;
import Model.Question;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mrloc
 */
public class CustomTableQuestion extends AbstractTableModel {

    private String header[] = {"Câu hỏi", "Mức độ", "Chương", "Bài"};
    private Class classes[] = {String.class, String.class, String.class, String.class};
    private ArrayList<Question> listQuestion = new ArrayList<>();

    public CustomTableQuestion(ArrayList<Question> list) {
        this.listQuestion = new ArrayList<>();
        this.listQuestion = list;
    }

    ChapterDAO chapterDAO = new ChapterDAO();
    LessonDAO lessonDAO = new LessonDAO();
    LevelDAO levelDAO = new LevelDAO();
    
    @Override
    public int getRowCount() {
        return listQuestion.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listQuestion.get(rowIndex).getQuestion();
            case 1:
                return levelDAO.getLevelByID(listQuestion.get(rowIndex).getLevel_ID()).getLevel_Name();
            case 2:
                return chapterDAO.getChapterByQuestion(listQuestion.get(rowIndex)).getChapter();
            case 3:
                return lessonDAO.findByID(listQuestion.get(rowIndex).getLesson_ID()).getLesson();
            default:
                return null;
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }
}
