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
public class Question {
    private int Question_ID;
    private String Question;
    private int Level_ID;
    private int Lesson_ID;

    public Question() {
    }

    public Question(int Question_ID, String Question, int Level_ID, int Lesson_ID) {
        this.Question_ID = Question_ID;
        this.Question = Question;
        this.Level_ID = Level_ID;
        this.Lesson_ID = Lesson_ID;
    }

    public int getQuestion_ID() {
        return Question_ID;
    }

    public void setQuestion_ID(int Question_ID) {
        this.Question_ID = Question_ID;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public int getLevel_ID() {
        return Level_ID;
    }

    public void setLevel_ID(int Level_ID) {
        this.Level_ID = Level_ID;
    }

    public int getLesson_ID() {
        return Lesson_ID;
    }

    public void setLesson_ID(int Lesson_ID) {
        this.Lesson_ID = Lesson_ID;
    }

       
}
