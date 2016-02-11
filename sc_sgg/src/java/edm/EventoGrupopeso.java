package edm;
// Generated 11-feb-2016 0:18:43 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EventoGrupopeso generated by hbm2java
 */
@Entity
@Table(name="EVENTO_GRUPOPESO"
    ,catalog="CLARITYCOW"
)
public class EventoGrupopeso  implements java.io.Serializable {


     private int eventogrupopesoId;
     private Integer grupopesoId;
     private Integer eventoId;

    public EventoGrupopeso() {
    }

	
    public EventoGrupopeso(int eventogrupopesoId) {
        this.eventogrupopesoId = eventogrupopesoId;
    }
    public EventoGrupopeso(int eventogrupopesoId, Integer grupopesoId, Integer eventoId) {
       this.eventogrupopesoId = eventogrupopesoId;
       this.grupopesoId = grupopesoId;
       this.eventoId = eventoId;
    }
   
     @Id 

    
    @Column(name="EVENTOGRUPOPESO_ID", unique=true, nullable=false)
    public int getEventogrupopesoId() {
        return this.eventogrupopesoId;
    }
    
    public void setEventogrupopesoId(int eventogrupopesoId) {
        this.eventogrupopesoId = eventogrupopesoId;
    }

    
    @Column(name="GRUPOPESO_ID")
    public Integer getGrupopesoId() {
        return this.grupopesoId;
    }
    
    public void setGrupopesoId(Integer grupopesoId) {
        this.grupopesoId = grupopesoId;
    }

    
    @Column(name="EVENTO_ID")
    public Integer getEventoId() {
        return this.eventoId;
    }
    
    public void setEventoId(Integer eventoId) {
        this.eventoId = eventoId;
    }




}


