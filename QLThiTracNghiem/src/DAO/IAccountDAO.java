/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Account;
import java.util.List;

/**
 *
 * @author mrloc
 */
public interface IAccountDAO extends IGenericDAO<Account>{
    List<Account> findAll();
    Account findByUserNameAndPassWord(String Username, String Password, Integer Status);
    Account findByID(int Account_ID);
    Account findByUserName(String username);
    Boolean changePass(int Account_ID,String newpass);
    List<Account> findByRoles(Boolean role);
    Account add(Account account);
    Boolean changeStatus(int Account_ID);
}
