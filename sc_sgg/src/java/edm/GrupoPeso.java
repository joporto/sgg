package edm;
// Generated 11-feb-2016 0:18:43 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * GrupoPeso generated by hbm2java
 */
@Entity
@Table(name="GRUPO_PESO"
    ,catalog="CLARITYCOW"
)
public class GrupoPeso  implements java.io.Serializable {


     private int grupopesoId;
     private String grupopesoDs;
     private int grupopesoLimInf;
     private int grupopesoLimSup;
     private Integer grupopesoStatus;

    public GrupoPeso() {
    }

	
    public GrupoPeso(int grupopesoId, String grupopesoDs, int grupopesoLimInf, int grupopesoLimSup) {
        this.grupopesoId = grupopesoId;
        this.grupopesoDs = grupopesoDs;
        this.grupopesoLimInf = grupopesoLimInf;
        this.grupopesoLimSup = grupopesoLimSup;
    }
    public GrupoPeso(int grupopesoId, String grupopesoDs, int grupopesoLimInf, int grupopesoLimSup, Integer grupopesoStatus) {
       this.grupopesoId = grupopesoId;
       this.grupopesoDs = grupopesoDs;
       this.grupopesoLimInf = grupopesoLimInf;
       this.grupopesoLimSup = grupopesoLimSup;
       this.grupopesoStatus = grupopesoStatus;
    }
   
     @Id 

    
    @Column(name="GRUPOPESO_ID", unique=true, nullable=false)
    public int getGrupopesoId() {
        return this.grupopesoId;
    }
    
    public void setGrupopesoId(int grupopesoId) {
        this.grupopesoId = grupopesoId;
    }

    
    @Column(name="GRUPOPESO_DS", nullable=false, length=50)
    public String getGrupopesoDs() {
        return this.grupopesoDs;
    }
    
    public void setGrupopesoDs(String grupopesoDs) {
        this.grupopesoDs = grupopesoDs;
    }

    
    @Column(name="GRUPOPESO_LIM_INF", nullable=false)
    public int getGrupopesoLimInf() {
        return this.grupopesoLimInf;
    }
    
    public void setGrupopesoLimInf(int grupopesoLimInf) {
        this.grupopesoLimInf = grupopesoLimInf;
    }

    
    @Column(name="GRUPOPESO_LIM_SUP", nullable=false)
    public int getGrupopesoLimSup() {
        return this.grupopesoLimSup;
    }
    
    public void setGrupopesoLimSup(int grupopesoLimSup) {
        this.grupopesoLimSup = grupopesoLimSup;
    }

    
    @Column(name="GRUPOPESO_STATUS")
    public Integer getGrupopesoStatus() {
        return this.grupopesoStatus;
    }
    
    public void setGrupopesoStatus(Integer grupopesoStatus) {
        this.grupopesoStatus = grupopesoStatus;
    }




}

