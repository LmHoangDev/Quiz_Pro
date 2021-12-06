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
public class Answer {
    private int Answer_ID;
    private String Answer;
    private boolean Correct;
    private int Question_ID;

    public Answer() {
    }

    public Answer(int Answer_ID, String Answer, boolean Correct, int Question_ID) {
        this.Answer_ID = Answer_ID;
        this.Answer = Answer;
        this.Correct = Correct;
        this.Question_ID = Question_ID;
    }

    public int getAnswer_ID() {
        return Answer_ID;
    }

    public void setAnswer_ID(int Answer_ID) {
        this.Answer_ID = Answer_ID;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    public boolean isCorrect() {
        return Correct;
    }

    public void setCorrect(boolean Correct) {
        this.Correct = Correct;
    }

    public int getQuestion_ID() {
        return Question_ID;
    }

    public void setQuestion_ID(int Question_ID) {
        this.Question_ID = Question_ID;
    }

    
    
}
