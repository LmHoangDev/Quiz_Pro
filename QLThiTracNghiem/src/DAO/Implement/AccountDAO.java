/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implement;

import DAO.IAccountDAO;
import Mapper.AccountMapper;
import Model.Account;
import java.util.List;

/**
 *
 * @author mrloc
 */
public class AccountDAO extends CommonDAO<Account> implements IAccountDAO{

    @Override
    public List<Account> findAll() {
        String sql = "Select * from dbo.Account";
        return excute(sql, new AccountMapper());
    }

    @Override
    public Account findByUserNameAndPassWord(String Username, String Password, Integer Status) {
        String sql = "Select * from dbo.Account where UserName = ? AND PassWord = ? And Status = ?";
        List<Account> list = excute(sql, new AccountMapper(), Username, Password, Status);
        return list.isEmpty()? null : list.get(0);
    }

    @Override
    public Account findByID(int Account_ID) {
        String sql = "Select * from dbo.Account where Account_ID = ?";
        List<Account> list = excute(sql, new AccountMapper(), Account_ID);
        return list.isEmpty()? null : list.get(0);
    }

    @Override
    public Boolean changePass(int Account_ID, String newpass) {
        String sql = "Update dbo.Account set PassWord = ? where Account_ID = ?";
        return update(sql, newpass,Account_ID);
    }

    @Override
    public List<Account> findByRoles(Boolean role) {
        String sql = "Select * from dbo.Account where Roles = ?";
        return excute(sql, new AccountMapper(), role);
    }

    @Override
    public Account findByUserName(String username) {
        String sql = "Select * from dbo.Account where UserName = ?";
        List<Account> list = excute(sql, new AccountMapper(), username);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public Account add(Account account) {
        String sql = "Insert into dbo.Account values(?,?,?,?,?)";
        Integer insertedID = insert(sql, account.getUsername(),account.getPassword(),account.getName(),account.isRole(),account.isStatus());
        return findByID(insertedID);
    }

    @Override
    public Boolean changeStatus(int Account_ID) {
        String sql = "Update dbo.Account set Status = Abs(Status -1 ) where Account_ID = ?";
        return update(sql, Account_ID);
    }
    
}
