/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper;

import java.sql.ResultSet;

/**
 *
 * @author mrloc
 */
public interface IMapper<T> {
    T mapRowToObject(ResultSet rs);
}
