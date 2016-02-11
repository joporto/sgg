package edm;
// Generated 11-feb-2016 0:18:43 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Raza generated by hbm2java
 */
@Entity
@Table(name="RAZA"
    ,catalog="CLARITYCOW"
)
public class Raza  implements java.io.Serializable {


     private int razaId;
     private String razaNombre;
     private String razaAbrev;
     private Integer razaStatus;

    public Raza() {
    }

	
    public Raza(int razaId) {
        this.razaId = razaId;
    }
    public Raza(int razaId, String razaNombre, String razaAbrev, Integer razaStatus) {
       this.razaId = razaId;
       this.razaNombre = razaNombre;
       this.razaAbrev = razaAbrev;
       this.razaStatus = razaStatus;
    }
   
     @Id 

    
    @Column(name="RAZA_ID", unique=true, nullable=false)
    public int getRazaId() {
        return this.razaId;
    }
    
    public void setRazaId(int razaId) {
        this.razaId = razaId;
    }

    
    @Column(name="RAZA_NOMBRE", length=25)
    public String getRazaNombre() {
        return this.razaNombre;
    }
    
    public void setRazaNombre(String razaNombre) {
        this.razaNombre = razaNombre;
    }

    
    @Column(name="RAZA_ABREV", length=2)
    public String getRazaAbrev() {
        return this.razaAbrev;
    }
    
    public void setRazaAbrev(String razaAbrev) {
        this.razaAbrev = razaAbrev;
    }

    
    @Column(name="RAZA_STATUS")
    public Integer getRazaStatus() {
        return this.razaStatus;
    }
    
    public void setRazaStatus(Integer razaStatus) {
        this.razaStatus = razaStatus;
    }




}


