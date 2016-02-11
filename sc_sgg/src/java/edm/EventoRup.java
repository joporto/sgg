package edm;
// Generated 11-feb-2016 0:18:43 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EventoRup generated by hbm2java
 */
@Entity
@Table(name="EVENTO_RUP"
    ,catalog="CLARITYCOW"
)
public class EventoRup  implements java.io.Serializable {


     private int eventorupId;
     private Integer rupId;
     private Integer eventoId;

    public EventoRup() {
    }

	
    public EventoRup(int eventorupId) {
        this.eventorupId = eventorupId;
    }
    public EventoRup(int eventorupId, Integer rupId, Integer eventoId) {
       this.eventorupId = eventorupId;
       this.rupId = rupId;
       this.eventoId = eventoId;
    }
   
     @Id 

    
    @Column(name="EVENTORUP_ID", unique=true, nullable=false)
    public int getEventorupId() {
        return this.eventorupId;
    }
    
    public void setEventorupId(int eventorupId) {
        this.eventorupId = eventorupId;
    }

    
    @Column(name="RUP_ID")
    public Integer getRupId() {
        return this.rupId;
    }
    
    public void setRupId(Integer rupId) {
        this.rupId = rupId;
    }

    
    @Column(name="EVENTO_ID")
    public Integer getEventoId() {
        return this.eventoId;
    }
    
    public void setEventoId(Integer eventoId) {
        this.eventoId = eventoId;
    }




}

