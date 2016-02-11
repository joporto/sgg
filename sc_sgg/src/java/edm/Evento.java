package edm;
// Generated 11-feb-2016 0:18:43 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Evento generated by hbm2java
 */
@Entity
@Table(name="EVENTO"
    ,catalog="CLARITYCOW"
)
public class Evento  implements java.io.Serializable {


     private int eventoId;
     private Integer animalId;
     private Integer eventotipoId;
     private Integer estadoanimalId;
     private Integer categoriaId;
     private String eventoDs;
     private Date eventoFechaReg;
     private Date eventoFechaEvento;
     private Float eventoValor;

    public Evento() {
    }

	
    public Evento(int eventoId, Date eventoFechaReg) {
        this.eventoId = eventoId;
        this.eventoFechaReg = eventoFechaReg;
    }
    public Evento(int eventoId, Integer animalId, Integer eventotipoId, Integer estadoanimalId, Integer categoriaId, String eventoDs, Date eventoFechaReg, Date eventoFechaEvento, Float eventoValor) {
       this.eventoId = eventoId;
       this.animalId = animalId;
       this.eventotipoId = eventotipoId;
       this.estadoanimalId = estadoanimalId;
       this.categoriaId = categoriaId;
       this.eventoDs = eventoDs;
       this.eventoFechaReg = eventoFechaReg;
       this.eventoFechaEvento = eventoFechaEvento;
       this.eventoValor = eventoValor;
    }
   
     @Id 

    
    @Column(name="EVENTO_ID", unique=true, nullable=false)
    public int getEventoId() {
        return this.eventoId;
    }
    
    public void setEventoId(int eventoId) {
        this.eventoId = eventoId;
    }

    
    @Column(name="ANIMAL_ID")
    public Integer getAnimalId() {
        return this.animalId;
    }
    
    public void setAnimalId(Integer animalId) {
        this.animalId = animalId;
    }

    
    @Column(name="EVENTOTIPO_ID")
    public Integer getEventotipoId() {
        return this.eventotipoId;
    }
    
    public void setEventotipoId(Integer eventotipoId) {
        this.eventotipoId = eventotipoId;
    }

    
    @Column(name="ESTADOANIMAL_ID")
    public Integer getEstadoanimalId() {
        return this.estadoanimalId;
    }
    
    public void setEstadoanimalId(Integer estadoanimalId) {
        this.estadoanimalId = estadoanimalId;
    }

    
    @Column(name="CATEGORIA_ID")
    public Integer getCategoriaId() {
        return this.categoriaId;
    }
    
    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    
    @Column(name="EVENTO_DS", length=200)
    public String getEventoDs() {
        return this.eventoDs;
    }
    
    public void setEventoDs(String eventoDs) {
        this.eventoDs = eventoDs;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="EVENTO_FECHA_REG", nullable=false, length=10)
    public Date getEventoFechaReg() {
        return this.eventoFechaReg;
    }
    
    public void setEventoFechaReg(Date eventoFechaReg) {
        this.eventoFechaReg = eventoFechaReg;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="EVENTO_FECHA_EVENTO", length=10)
    public Date getEventoFechaEvento() {
        return this.eventoFechaEvento;
    }
    
    public void setEventoFechaEvento(Date eventoFechaEvento) {
        this.eventoFechaEvento = eventoFechaEvento;
    }

    
    @Column(name="EVENTO_VALOR", precision=12, scale=0)
    public Float getEventoValor() {
        return this.eventoValor;
    }
    
    public void setEventoValor(Float eventoValor) {
        this.eventoValor = eventoValor;
    }




}

