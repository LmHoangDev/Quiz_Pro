/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author mrloc
 */
public class Lesson {
    private int Lesson_ID;
    private int Lesson;
    private String Lesson_Name;
    private int Chapter_ID;

    public Lesson() {
    }

    public Lesson(int Lesson_ID, int Lesson, String Lesson_Name, int Chapter_ID) {
        this.Lesson_ID = Lesson_ID;
        this.Lesson = Lesson;
        this.Lesson_Name = Lesson_Name;
        this.Chapter_ID = Chapter_ID;
    }

    public int getLesson_ID() {
        return Lesson_ID;
    }

    public void setLesson_ID(int Lesson_ID) {
        this.Lesson_ID = Lesson_ID;
    }

    public int getLesson() {
        return Lesson;
    }

    public void setLesson(int Lesson) {
        this.Lesson = Lesson;
    }

    public String getLesson_Name() {
        return Lesson_Name;
    }

    public void setLesson_Name(String Lesson_Name) {
        this.Lesson_Name = Lesson_Name;
    }

    public int getChapter_ID() {
        return Chapter_ID;
    }

    public void setChapter_ID(int Chapter_ID) {
        this.Chapter_ID = Chapter_ID;
    }
}
