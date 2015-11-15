package pl.pjaneczek.srb.model;
// Generated 2015-11-07 15:30:51 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Users generated by hbm2java
 */
public class Users  implements java.io.Serializable {


     private String username;
     private String password;
     private byte enabled;
     private Set<UserRoles> userRoleses = new HashSet<UserRoles>(0);

    public Users() {
    }

	
    public Users(String username, String password, byte enabled) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
    }
    public Users(String username, String password, byte enabled, Set<UserRoles> userRoleses) {
       this.username = username;
       this.password = password;
       this.enabled = enabled;
       this.userRoleses = userRoleses;
    }
   
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public byte getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(byte enabled) {
        this.enabled = enabled;
    }
    public Set<UserRoles> getUserRoleses() {
        return this.userRoleses;
    }
    
    public void setUserRoleses(Set<UserRoles> userRoleses) {
        this.userRoleses = userRoleses;
    }




}


