/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alejandra Becerra
 */
@Entity
@Table(name = "registro_entrada_salida")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegistroEntradaSalida.findAll", query = "SELECT r FROM RegistroEntradaSalida r"),
    @NamedQuery(name = "RegistroEntradaSalida.findByControl", query = "SELECT r FROM RegistroEntradaSalida r WHERE r.control = :control"),
    @NamedQuery(name = "RegistroEntradaSalida.findByHoraEntrada", query = "SELECT r FROM RegistroEntradaSalida r WHERE r.horaEntrada = :horaEntrada"),
    @NamedQuery(name = "RegistroEntradaSalida.findByFecha", query = "SELECT r FROM RegistroEntradaSalida r WHERE r.fecha = :fecha"),
    @NamedQuery(name = "RegistroEntradaSalida.findByHoraSalida", query = "SELECT r FROM RegistroEntradaSalida r WHERE r.horaSalida = :horaSalida")})
public class RegistroEntradaSalida implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "control")
    private Integer control;
    @Basic(optional = false)
    @Column(name = "horaEntrada")
    @Temporal(TemporalType.TIME)
    private Date horaEntrada;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "horaSalida")
    @Temporal(TemporalType.TIME)
    private Date horaSalida;
    @JoinColumn(name = "cedula", referencedColumnName = "documento")
    @ManyToOne(optional = false)
    private Personas cedula;

    public RegistroEntradaSalida() {
    }

    public RegistroEntradaSalida(Integer control) {
        this.control = control;
    }

    public RegistroEntradaSalida(Integer control, Date horaEntrada, Date fecha) {
        this.control = control;
        this.horaEntrada = horaEntrada;
        this.fecha = fecha;
    }

    public Integer getControl() {
        return control;
    }

    public void setControl(Integer control) {
        this.control = control;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Personas getCedula() {
        return cedula;
    }

    public void setCedula(Personas cedula) {
        this.cedula = cedula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (control != null ? control.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistroEntradaSalida)) {
            return false;
        }
        RegistroEntradaSalida other = (RegistroEntradaSalida) object;
        if ((this.control == null && other.control != null) || (this.control != null && !this.control.equals(other.control))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.tablas.RegistroEntradaSalida[ control=" + control + " ]";
    }
    
}
