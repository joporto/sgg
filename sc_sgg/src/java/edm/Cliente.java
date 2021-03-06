package edm;
// Generated 11-feb-2016 0:18:43 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Cliente generated by hbm2java
 */
@Entity
@Table(name="CLIENTE"
    ,catalog="CLARITYCOW"
)
public class Cliente  implements java.io.Serializable {


     private int clienteId;
     private int clienteNrut;
     private String clienteDrut;
     private String clienteNombre;
     private Integer rupId;
     private Integer clienteStatus;

    public Cliente() {
    }

	
    public Cliente(int clienteId, int clienteNrut, String clienteDrut) {
        this.clienteId = clienteId;
        this.clienteNrut = clienteNrut;
        this.clienteDrut = clienteDrut;
    }
    public Cliente(int clienteId, int clienteNrut, String clienteDrut, String clienteNombre, Integer rupId, Integer clienteStatus) {
       this.clienteId = clienteId;
       this.clienteNrut = clienteNrut;
       this.clienteDrut = clienteDrut;
       this.clienteNombre = clienteNombre;
       this.rupId = rupId;
       this.clienteStatus = clienteStatus;
    }
   
     @Id 

    
    @Column(name="CLIENTE_ID", unique=true, nullable=false)
    public int getClienteId() {
        return this.clienteId;
    }
    
    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    
    @Column(name="CLIENTE_NRUT", nullable=false)
    public int getClienteNrut() {
        return this.clienteNrut;
    }
    
    public void setClienteNrut(int clienteNrut) {
        this.clienteNrut = clienteNrut;
    }

    
    @Column(name="CLIENTE_DRUT", nullable=false, length=1)
    public String getClienteDrut() {
        return this.clienteDrut;
    }
    
    public void setClienteDrut(String clienteDrut) {
        this.clienteDrut = clienteDrut;
    }

    
    @Column(name="CLIENTE_NOMBRE", length=50)
    public String getClienteNombre() {
        return this.clienteNombre;
    }
    
    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }

    
    @Column(name="RUP_ID")
    public Integer getRupId() {
        return this.rupId;
    }
    
    public void setRupId(Integer rupId) {
        this.rupId = rupId;
    }

    
    @Column(name="CLIENTE_STATUS")
    public Integer getClienteStatus() {
        return this.clienteStatus;
    }
    
    public void setClienteStatus(Integer clienteStatus) {
        this.clienteStatus = clienteStatus;
    }




}


