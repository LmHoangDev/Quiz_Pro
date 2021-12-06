/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomTableModel;

import DAO.Implement.QuestionDAO;
import Model.Answer;
import javax.swing.JButton;

/**
 *
 * @author mrloc
 */
public class AnswerTableModel {
    private String question, answer,correct;
    // Variables declaration - do not modify
    private JButton jButtonChangeStatus;
    public AnswerTableModel() {
    }

    public AnswerTableModel(Answer a) {
        this.question = new QuestionDAO().findByID(a.getQuestion_ID()).getQuestion();
        this.answer = a.getAnswer();
        this.correct = a.isCorrect()? "Đúng" : "Sai";
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        return question + "\t | \t" + answer + "\t | \t" + correct;
    }
    
}
