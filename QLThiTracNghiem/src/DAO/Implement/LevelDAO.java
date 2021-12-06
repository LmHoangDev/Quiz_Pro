/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implement;

import DAO.ILevelDAO;
import Mapper.LevelMapper;
import Model.Level;
import java.util.List;

/**
 *
 * @author mrloc
 */
public class LevelDAO extends CommonDAO<Level> implements ILevelDAO{

    @Override
    public List<Level> getAllLevel() {
        String sql = "Select * from dbo.Level";
        return excute(sql, new LevelMapper());
    }

    @Override
    public Level getLevelByID(int LevelID) {
        String sql = "Select * from dbo.Level where Level_ID = ?";
        List<Level> list = excute(sql, new LevelMapper(), LevelID);
        return list.isEmpty()? null : list.get(0);
    }
    
}
