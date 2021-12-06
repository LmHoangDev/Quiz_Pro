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
public class Chapter {
    private int Chapter_ID;
    private int Chapter;
    private String Chapter_Name;
    
    public Chapter() {
    }

    public Chapter(int Chapter_ID, int Chapter, String Chapter_Name) {
        this.Chapter_ID = Chapter_ID;
        this.Chapter = Chapter;
        this.Chapter_Name = Chapter_Name;
    }

    public int getChapter_ID() {
        return Chapter_ID;
    }

    public void setChapter_ID(int Chapter_ID) {
        this.Chapter_ID = Chapter_ID;
    }

    public int getChapter() {
        return Chapter;
    }

    public void setChapter(int Chapter) {
        this.Chapter = Chapter;
    }

    public String getChapter_Name() {
        return Chapter_Name;
    }

    public void setChapter_Name(String Chapter_Name) {
        this.Chapter_Name = Chapter_Name;
    }

    @Override
    public String toString() {
        return "Chương " + this.Chapter + " : " + this.Chapter_Name;
    }
    
}
