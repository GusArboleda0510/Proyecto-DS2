/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alejandra Becerra
 */
@Entity
@Table(name = "facultades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facultades.findAll", query = "SELECT f FROM Facultades f"),
    @NamedQuery(name = "Facultades.findByIdFacultad", query = "SELECT f FROM Facultades f WHERE f.idFacultad = :idFacultad"),
    @NamedQuery(name = "Facultades.findByNombre", query = "SELECT f FROM Facultades f WHERE f.nombre = :nombre"),
    @NamedQuery(name = "Facultades.findByCorreo", query = "SELECT f FROM Facultades f WHERE f.correo = :correo")})
public class Facultades implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idFacultad")
    private Integer idFacultad;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "correo")
    private String correo;
    @OneToMany(mappedBy = "idFacultad")
    private Collection<Programas> programasCollection;

    public Facultades() {
    }

    public Facultades(Integer idFacultad) {
        this.idFacultad = idFacultad;
    }

    public Facultades(Integer idFacultad, String nombre, String correo) {
        this.idFacultad = idFacultad;
        this.nombre = nombre;
        this.correo = correo;
    }

    public Integer getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(Integer idFacultad) {
        this.idFacultad = idFacultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @XmlTransient
    public Collection<Programas> getProgramasCollection() {
        return programasCollection;
    }

    public void setProgramasCollection(Collection<Programas> programasCollection) {
        this.programasCollection = programasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFacultad != null ? idFacultad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facultades)) {
            return false;
        }
        Facultades other = (Facultades) object;
        if ((this.idFacultad == null && other.idFacultad != null) || (this.idFacultad != null && !this.idFacultad.equals(other.idFacultad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.tablas.Facultades[ idFacultad=" + idFacultad + " ]";
    }
    
}
