package edm;
// Generated 11-feb-2016 0:18:43 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Insumo generated by hbm2java
 */
@Entity
@Table(name="INSUMO"
    ,catalog="CLARITYCOW"
)
public class Insumo  implements java.io.Serializable {


     private int insumoId;
     private Integer tipoinsumoId;
     private Integer insumoCodigoSap;
     private String insumoNombre;
     private String insumoUnidadMedida;
     private Integer insumoStatus;
     private Integer insumoCantidad;

    public Insumo() {
    }

	
    public Insumo(int insumoId) {
        this.insumoId = insumoId;
    }
    public Insumo(int insumoId, Integer tipoinsumoId, Integer insumoCodigoSap, String insumoNombre, String insumoUnidadMedida, Integer insumoStatus, Integer insumoCantidad) {
       this.insumoId = insumoId;
       this.tipoinsumoId = tipoinsumoId;
       this.insumoCodigoSap = insumoCodigoSap;
       this.insumoNombre = insumoNombre;
       this.insumoUnidadMedida = insumoUnidadMedida;
       this.insumoStatus = insumoStatus;
       this.insumoCantidad = insumoCantidad;
    }
   
     @Id 

    
    @Column(name="INSUMO_ID", unique=true, nullable=false)
    public int getInsumoId() {
        return this.insumoId;
    }
    
    public void setInsumoId(int insumoId) {
        this.insumoId = insumoId;
    }

    
    @Column(name="TIPOINSUMO_ID")
    public Integer getTipoinsumoId() {
        return this.tipoinsumoId;
    }
    
    public void setTipoinsumoId(Integer tipoinsumoId) {
        this.tipoinsumoId = tipoinsumoId;
    }

    
    @Column(name="INSUMO_CODIGO_SAP")
    public Integer getInsumoCodigoSap() {
        return this.insumoCodigoSap;
    }
    
    public void setInsumoCodigoSap(Integer insumoCodigoSap) {
        this.insumoCodigoSap = insumoCodigoSap;
    }

    
    @Column(name="INSUMO_NOMBRE", length=50)
    public String getInsumoNombre() {
        return this.insumoNombre;
    }
    
    public void setInsumoNombre(String insumoNombre) {
        this.insumoNombre = insumoNombre;
    }

    
    @Column(name="INSUMO_UNIDAD_MEDIDA", length=25)
    public String getInsumoUnidadMedida() {
        return this.insumoUnidadMedida;
    }
    
    public void setInsumoUnidadMedida(String insumoUnidadMedida) {
        this.insumoUnidadMedida = insumoUnidadMedida;
    }

    
    @Column(name="INSUMO_STATUS")
    public Integer getInsumoStatus() {
        return this.insumoStatus;
    }
    
    public void setInsumoStatus(Integer insumoStatus) {
        this.insumoStatus = insumoStatus;
    }

    
    @Column(name="INSUMO_CANTIDAD")
    public Integer getInsumoCantidad() {
        return this.insumoCantidad;
    }
    
    public void setInsumoCantidad(Integer insumoCantidad) {
        this.insumoCantidad = insumoCantidad;
    }




}

