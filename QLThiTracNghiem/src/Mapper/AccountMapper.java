/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper;

import Model.Account;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mrloc
 */
public class AccountMapper implements IMapper<Account>{

    @Override
    public Account mapRowToObject(ResultSet rs) {
        try{
            Account account = new Account();
            account.setAccount_ID(rs.getInt("Account_ID"));
            account.setUsername(rs.getString("UserName"));
            account.setPassword(rs.getString("PassWord"));
            account.setName(rs.getString("Name"));
            account.setRole(rs.getBoolean("Roles"));
            account.setStatus(rs.getBoolean("Status"));
            return account;
        }catch(SQLException e){
            return null;
        }
    }
    
}
