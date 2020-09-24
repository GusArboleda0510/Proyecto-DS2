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
@Table(name = "novedades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Novedades.findAll", query = "SELECT n FROM Novedades n"),
    @NamedQuery(name = "Novedades.findByCodigo", query = "SELECT n FROM Novedades n WHERE n.codigo = :codigo"),
    @NamedQuery(name = "Novedades.findByTemperatura", query = "SELECT n FROM Novedades n WHERE n.temperatura = :temperatura"),
    @NamedQuery(name = "Novedades.findByEnfermedadesPreexistente", query = "SELECT n FROM Novedades n WHERE n.enfermedadesPreexistente = :enfermedadesPreexistente"),
    @NamedQuery(name = "Novedades.findByConviveMenores", query = "SELECT n FROM Novedades n WHERE n.conviveMenores = :conviveMenores"),
    @NamedQuery(name = "Novedades.findByConviveMayores", query = "SELECT n FROM Novedades n WHERE n.conviveMayores = :conviveMayores"),
    @NamedQuery(name = "Novedades.findByObservaciones", query = "SELECT n FROM Novedades n WHERE n.observaciones = :observaciones"),
    @NamedQuery(name = "Novedades.findByFecha", query = "SELECT n FROM Novedades n WHERE n.fecha = :fecha"),
    @NamedQuery(name = "Novedades.findByHora", query = "SELECT n FROM Novedades n WHERE n.hora = :hora")})
public class Novedades implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "temperatura")
    private String temperatura;
    @Basic(optional = false)
    @Column(name = "enfermedades_preexistente")
    private String enfermedadesPreexistente;
    @Basic(optional = false)
    @Column(name = "convive_menores")
    private String conviveMenores;
    @Basic(optional = false)
    @Column(name = "convive_mayores")
    private String conviveMayores;
    @Basic(optional = false)
    @Column(name = "observaciones")
    private String observaciones;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @JoinColumn(name = "usuario", referencedColumnName = "usuario")
    @ManyToOne(optional = false)
    private Funcionario usuario;
    @JoinColumn(name = "documento", referencedColumnName = "documento")
    @ManyToOne(optional = false)
    private Personas documento;

    public Novedades() {
    }

    public Novedades(Integer codigo) {
        this.codigo = codigo;
    }

    public Novedades(Integer codigo, String temperatura, String enfermedadesPreexistente, String conviveMenores, String conviveMayores, String observaciones, Date fecha, Date hora) {
        this.codigo = codigo;
        this.temperatura = temperatura;
        this.enfermedadesPreexistente = enfermedadesPreexistente;
        this.conviveMenores = conviveMenores;
        this.conviveMayores = conviveMayores;
        this.observaciones = observaciones;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getEnfermedadesPreexistente() {
        return enfermedadesPreexistente;
    }

    public void setEnfermedadesPreexistente(String enfermedadesPreexistente) {
        this.enfermedadesPreexistente = enfermedadesPreexistente;
    }

    public String getConviveMenores() {
        return conviveMenores;
    }

    public void setConviveMenores(String conviveMenores) {
        this.conviveMenores = conviveMenores;
    }

    public String getConviveMayores() {
        return conviveMayores;
    }

    public void setConviveMayores(String conviveMayores) {
        this.conviveMayores = conviveMayores;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Funcionario getUsuario() {
        return usuario;
    }

    public void setUsuario(Funcionario usuario) {
        this.usuario = usuario;
    }

    public Personas getDocumento() {
        return documento;
    }

    public void setDocumento(Personas documento) {
        this.documento = documento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Novedades)) {
            return false;
        }
        Novedades other = (Novedades) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.tablas.Novedades[ codigo=" + codigo + " ]";
    }
    
}
