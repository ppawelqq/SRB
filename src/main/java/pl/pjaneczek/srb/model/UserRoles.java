package pl.pjaneczek.srb.model;
// Generated 2015-11-07 15:30:51 by Hibernate Tools 4.3.1



/**
 * UserRoles generated by hbm2java
 */
public class UserRoles  implements java.io.Serializable {


     private Integer userRoleId;
     private Users users;
     private String role;

    public UserRoles() {
    }

    public UserRoles(Users users, String role) {
       this.users = users;
       this.role = role;
    }
   
    public Integer getUserRoleId() {
        return this.userRoleId;
    }
    
    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }
    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }




}

