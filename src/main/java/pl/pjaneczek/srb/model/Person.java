package pl.pjaneczek.srb.model;
// Generated 2015-11-07 15:30:51 by Hibernate Tools 4.3.1



/**
 * Person generated by hbm2java
 */
public class Person  implements java.io.Serializable {


     private int personId;
     private String name;
     private String lastname;
     private Integer telephone;

    public Person() {
    }

	
    public Person(int personId) {
        this.personId = personId;
    }
    public Person(int personId, String name, String lastname, Integer telephone) {
       this.personId = personId;
       this.name = name;
       this.lastname = lastname;
       this.telephone = telephone;
    }
   
    public int getPersonId() {
        return this.personId;
    }
    
    public void setPersonId(int personId) {
        this.personId = personId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public Integer getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }




}

