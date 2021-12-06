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
public class Level {
    private int Level_ID;
    private String Level_Name;

    public Level() {
    }

    public Level(int Level_ID, String Level_Name) {
        this.Level_ID = Level_ID;
        this.Level_Name = Level_Name;
    }
    
    public int getLevel_ID() {
        return Level_ID;
    }

    public void setLevel_ID(int Level_ID) {
        this.Level_ID = Level_ID;
    }

    public String getLevel_Name() {
        return Level_Name;
    }

    public void setLevel_Name(String Level_Name) {
        this.Level_Name = Level_Name;
    }
    
}
