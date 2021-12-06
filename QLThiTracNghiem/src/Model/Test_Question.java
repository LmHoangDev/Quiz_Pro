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
public class Test_Question {
    private int T_QT_ID;
    private int Test_ID;
    private int Question_ID;    

    public Test_Question() {
    }

    public Test_Question(int T_QT_ID, int Test_ID, int Question_ID) {
        this.T_QT_ID = T_QT_ID;
        this.Test_ID = Test_ID;
        this.Question_ID = Question_ID;
    }

    public int getT_QT_ID() {
        return T_QT_ID;
    }

    public void setT_QT_ID(int T_QT_ID) {
        this.T_QT_ID = T_QT_ID;
    }

    public int getTest_ID() {
        return Test_ID;
    }

    public void setTest_ID(int Test_ID) {
        this.Test_ID = Test_ID;
    }

    public int getQuestion_ID() {
        return Question_ID;
    }

    public void setQuestion_ID(int Question_ID) {
        this.Question_ID = Question_ID;
    }
    
    
}
