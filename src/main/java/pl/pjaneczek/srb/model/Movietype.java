package pl.pjaneczek.srb.model;
// Generated 2015-11-07 15:30:51 by Hibernate Tools 4.3.1



/**
 * Movietype generated by hbm2java
 */
public class Movietype  implements java.io.Serializable {


     private int movietypeId;
     private String movietypeLabel;

    public Movietype() {
    }

	
    public Movietype(int movietypeId) {
        this.movietypeId = movietypeId;
    }
    public Movietype(int movietypeId, String movietypeLabel) {
       this.movietypeId = movietypeId;
       this.movietypeLabel = movietypeLabel;
    }
   
    public int getMovietypeId() {
        return this.movietypeId;
    }
    
    public void setMovietypeId(int movietypeId) {
        this.movietypeId = movietypeId;
    }
    public String getMovietypeLabel() {
        return this.movietypeLabel;
    }
    
    public void setMovietypeLabel(String movietypeLabel) {
        this.movietypeLabel = movietypeLabel;
    }




}


