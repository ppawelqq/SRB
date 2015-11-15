package pl.pjaneczek.srb.model;
// Generated 2015-11-07 15:30:51 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Seans generated by hbm2java
 */
public class Seans  implements java.io.Serializable {


     private int seansId;
     private Integer personId;
     private String movieName;
     private Date data;
     private String czas;
     private Integer nrSali;
     private Integer nrMiejsca;
     private Integer idMiejsca;

    public Seans() {
    }

	
    public Seans(int seansId) {
        this.seansId = seansId;
    }
    public Seans(int seansId, Integer personId, String movieName, Date data, String czas, Integer nrSali, Integer nrMiejsca, Integer idMiejsca) {
       this.seansId = seansId;
       this.personId = personId;
       this.movieName = movieName;
       this.data = data;
       this.czas = czas;
       this.nrSali = nrSali;
       this.nrMiejsca = nrMiejsca;
       this.idMiejsca = idMiejsca;
    }
   
    public int getSeansId() {
        return this.seansId;
    }
    
    public void setSeansId(int seansId) {
        this.seansId = seansId;
    }
    public Integer getPersonId() {
        return this.personId;
    }
    
    public void setPersonId(Integer personId) {
        this.personId = personId;
    }
    public String getMovieName() {
        return this.movieName;
    }
    
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    public String getCzas() {
        return this.czas;
    }
    
    public void setCzas(String czas) {
        this.czas = czas;
    }
    public Integer getNrSali() {
        return this.nrSali;
    }
    
    public void setNrSali(Integer nrSali) {
        this.nrSali = nrSali;
    }
    public Integer getNrMiejsca() {
        return this.nrMiejsca;
    }
    
    public void setNrMiejsca(Integer nrMiejsca) {
        this.nrMiejsca = nrMiejsca;
    }
    public Integer getIdMiejsca() {
        return this.idMiejsca;
    }
    
    public void setIdMiejsca(Integer idMiejsca) {
        this.idMiejsca = idMiejsca;
    }




}


