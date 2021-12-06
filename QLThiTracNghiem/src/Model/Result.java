/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author mrloc
 */
public class Result {
    private int Result_ID;
    private int Account_ID;
    private int Test_ID;
    private int Time;
    private int Correct_QT;
    private Date Result_Date;
    private float Mark;

    

    public Result() {
    }

    public Result(int Result_ID, int Account_ID, int Test_ID, int Time, int Correct_QT, Date Result_Date, float Mark) {
        this.Result_ID = Result_ID;
        this.Account_ID = Account_ID;
        this.Test_ID = Test_ID;
        this.Time = Time;
        this.Correct_QT = Correct_QT;
        this.Result_Date = Result_Date;
        this.Mark = Mark;
    }
    
    public int getResult_ID() {
        return Result_ID;
    }

    public void setResult_ID(int Result_ID) {
        this.Result_ID = Result_ID;
    }

    public int getAccount_ID() {
        return Account_ID;
    }

    public void setAccount_ID(int Account_ID) {
        this.Account_ID = Account_ID;
    }

    public int getTest_ID() {
        return Test_ID;
    }

    public void setTest_ID(int Test_ID) {
        this.Test_ID = Test_ID;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int Time) {
        this.Time = Time;
    }

    public int getCorrect_QT() {
        return Correct_QT;
    }

    public void setCorrect_QT(int Correct_QT) {
        this.Correct_QT = Correct_QT;
    }

    public Date getResult_Date() {
        return Result_Date;
    }

    public void setResult_Date(Date Result_Date) {
        this.Result_Date = Result_Date;
    }

    public void setMark(float Mark) {
        this.Mark = Mark;
    }

    public float getMark() {
        return Mark;
    }
}
