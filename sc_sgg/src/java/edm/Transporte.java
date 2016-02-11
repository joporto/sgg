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
 * Transporte generated by hbm2java
 */
@Entity
@Table(name="TRANSPORTE"
    ,catalog="CLARITYCOW"
)
public class Transporte  implements java.io.Serializable {


     private int transporteId;
     private int vehiculoId;
     private Integer transporteRupOrigen;
     private Integer transporteRupDestino;
     private Integer transportistaId;
     private Date transporteFecha;
     private int transporteFma;
     private Integer transporteGuiaDespacho;
     private String transportePatenteAcoplado;

    public Transporte() {
    }

	
    public Transporte(int transporteId, int vehiculoId, Date transporteFecha, int transporteFma) {
        this.transporteId = transporteId;
        this.vehiculoId = vehiculoId;
        this.transporteFecha = transporteFecha;
        this.transporteFma = transporteFma;
    }
    public Transporte(int transporteId, int vehiculoId, Integer transporteRupOrigen, Integer transporteRupDestino, Integer transportistaId, Date transporteFecha, int transporteFma, Integer transporteGuiaDespacho, String transportePatenteAcoplado) {
       this.transporteId = transporteId;
       this.vehiculoId = vehiculoId;
       this.transporteRupOrigen = transporteRupOrigen;
       this.transporteRupDestino = transporteRupDestino;
       this.transportistaId = transportistaId;
       this.transporteFecha = transporteFecha;
       this.transporteFma = transporteFma;
       this.transporteGuiaDespacho = transporteGuiaDespacho;
       this.transportePatenteAcoplado = transportePatenteAcoplado;
    }
   
     @Id 

    
    @Column(name="TRANSPORTE_ID", unique=true, nullable=false)
    public int getTransporteId() {
        return this.transporteId;
    }
    
    public void setTransporteId(int transporteId) {
        this.transporteId = transporteId;
    }

    
    @Column(name="VEHICULO_ID", nullable=false)
    public int getVehiculoId() {
        return this.vehiculoId;
    }
    
    public void setVehiculoId(int vehiculoId) {
        this.vehiculoId = vehiculoId;
    }

    
    @Column(name="TRANSPORTE_RUP_ORIGEN")
    public Integer getTransporteRupOrigen() {
        return this.transporteRupOrigen;
    }
    
    public void setTransporteRupOrigen(Integer transporteRupOrigen) {
        this.transporteRupOrigen = transporteRupOrigen;
    }

    
    @Column(name="TRANSPORTE_RUP_DESTINO")
    public Integer getTransporteRupDestino() {
        return this.transporteRupDestino;
    }
    
    public void setTransporteRupDestino(Integer transporteRupDestino) {
        this.transporteRupDestino = transporteRupDestino;
    }

    
    @Column(name="TRANSPORTISTA_ID")
    public Integer getTransportistaId() {
        return this.transportistaId;
    }
    
    public void setTransportistaId(Integer transportistaId) {
        this.transportistaId = transportistaId;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="TRANSPORTE_FECHA", nullable=false, length=10)
    public Date getTransporteFecha() {
        return this.transporteFecha;
    }
    
    public void setTransporteFecha(Date transporteFecha) {
        this.transporteFecha = transporteFecha;
    }

    
    @Column(name="TRANSPORTE_FMA", nullable=false)
    public int getTransporteFma() {
        return this.transporteFma;
    }
    
    public void setTransporteFma(int transporteFma) {
        this.transporteFma = transporteFma;
    }

    
    @Column(name="TRANSPORTE_GUIA_DESPACHO")
    public Integer getTransporteGuiaDespacho() {
        return this.transporteGuiaDespacho;
    }
    
    public void setTransporteGuiaDespacho(Integer transporteGuiaDespacho) {
        this.transporteGuiaDespacho = transporteGuiaDespacho;
    }

    
    @Column(name="TRANSPORTE_PATENTE_ACOPLADO", length=10)
    public String getTransportePatenteAcoplado() {
        return this.transportePatenteAcoplado;
    }
    
    public void setTransportePatenteAcoplado(String transportePatenteAcoplado) {
        this.transportePatenteAcoplado = transportePatenteAcoplado;
    }




}


