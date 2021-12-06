/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Level;
import java.util.List;

/**
 *
 * @author mrloc
 */
public interface ILevelDAO extends IGenericDAO<Level>{
    List<Level> getAllLevel();
    Level getLevelByID(int LevelID);
}
