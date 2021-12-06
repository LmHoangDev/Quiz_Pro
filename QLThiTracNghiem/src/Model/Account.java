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
public class Account {

    private int Account_ID;
    private String Username;
    private String Password;
    private boolean Role;
    private String Name;
    private boolean Status;
    private String StatusString;
    
    public Account() {
        
    }

    public Account(int Accout_ID, String Username, String Password, boolean Role, String Name, boolean Status) {
        this.Account_ID = Accout_ID;
        this.Username = Username;
        this.Password = Password;
        this.Role = Role;
        this.Name = Name;
        this.Status = Status;
    }

    public String getStatusString() {
        return Status ? "Đã kích hoạt" : "Đã vô hiệu hóa";
    }

    public void setStatusString(String StatusString) {
        this.StatusString = StatusString;
    }

    
    
    public int getAccount_ID() {
        return Account_ID;
    }

    public void setAccount_ID(int Account_ID) {
        this.Account_ID = Account_ID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public boolean isRole() {
        return Role;
    }

    public void setRole(boolean Role) {
        this.Role = Role;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }
}
