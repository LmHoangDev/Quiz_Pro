/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Mapper.IMapper;
import java.util.List;

/**
 *
 * @author mrloc
 */
public interface IGenericDAO<T> {
    <T> List<T> excute(String sql, IMapper<T> mapper, Object... parameters);
    Integer insert(String sql, Object... parameters);
    Boolean update(String sql, Object... parameters);
}
