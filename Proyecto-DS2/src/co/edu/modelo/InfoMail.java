/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alejandra Becerra
 */
@Entity
@Table(name = "info_mail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InfoMail.findAll", query = "SELECT i FROM InfoMail i"),
    @NamedQuery(name = "InfoMail.findByIdDatos", query = "SELECT i FROM InfoMail i WHERE i.idDatos = :idDatos"),
    @NamedQuery(name = "InfoMail.findByDestino", query = "SELECT i FROM InfoMail i WHERE i.destino = :destino"),
    @NamedQuery(name = "InfoMail.findByClaveDestino", query = "SELECT i FROM InfoMail i WHERE i.claveDestino = :claveDestino"),
    @NamedQuery(name = "InfoMail.findByHost1", query = "SELECT i FROM InfoMail i WHERE i.host1 = :host1"),
    @NamedQuery(name = "InfoMail.findByHost2", query = "SELECT i FROM InfoMail i WHERE i.host2 = :host2"),
    @NamedQuery(name = "InfoMail.findByPuerto1", query = "SELECT i FROM InfoMail i WHERE i.puerto1 = :puerto1"),
    @NamedQuery(name = "InfoMail.findByPuerto2", query = "SELECT i FROM InfoMail i WHERE i.puerto2 = :puerto2"),
    @NamedQuery(name = "InfoMail.findByCorreoAdmin", query = "SELECT i FROM InfoMail i WHERE i.correoAdmin = :correoAdmin")})
public class InfoMail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_datos")
    private Integer idDatos;
    @Basic(optional = false)
    @Column(name = "destino")
    private String destino;
    @Basic(optional = false)
    @Column(name = "clave_destino")
    private String claveDestino;
    @Basic(optional = false)
    @Column(name = "host1")
    private String host1;
    @Basic(optional = false)
    @Column(name = "host2")
    private String host2;
    @Basic(optional = false)
    @Column(name = "puerto1")
    private String puerto1;
    @Basic(optional = false)
    @Column(name = "puerto2")
    private String puerto2;
    @Basic(optional = false)
    @Column(name = "correo_admin")
    private String correoAdmin;

    public InfoMail() {
    }

    public InfoMail(Integer idDatos) {
        this.idDatos = idDatos;
    }

    public InfoMail(Integer idDatos, String destino, String claveDestino, String host1, String host2, String puerto1, String puerto2, String correoAdmin) {
        this.idDatos = idDatos;
        this.destino = destino;
        this.claveDestino = claveDestino;
        this.host1 = host1;
        this.host2 = host2;
        this.puerto1 = puerto1;
        this.puerto2 = puerto2;
        this.correoAdmin = correoAdmin;
    }

    public Integer getIdDatos() {
        return idDatos;
    }

    public void setIdDatos(Integer idDatos) {
        this.idDatos = idDatos;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getClaveDestino() {
        return claveDestino;
    }

    public void setClaveDestino(String claveDestino) {
        this.claveDestino = claveDestino;
    }

    public String getHost1() {
        return host1;
    }

    public void setHost1(String host1) {
        this.host1 = host1;
    }

    public String getHost2() {
        return host2;
    }

    public void setHost2(String host2) {
        this.host2 = host2;
    }

    public String getPuerto1() {
        return puerto1;
    }

    public void setPuerto1(String puerto1) {
        this.puerto1 = puerto1;
    }

    public String getPuerto2() {
        return puerto2;
    }

    public void setPuerto2(String puerto2) {
        this.puerto2 = puerto2;
    }

    public String getCorreoAdmin() {
        return correoAdmin;
    }

    public void setCorreoAdmin(String correoAdmin) {
        this.correoAdmin = correoAdmin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDatos != null ? idDatos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InfoMail)) {
            return false;
        }
        InfoMail other = (InfoMail) object;
        if ((this.idDatos == null && other.idDatos != null) || (this.idDatos != null && !this.idDatos.equals(other.idDatos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.tablas.InfoMail[ idDatos=" + idDatos + " ]";
    }
    
}
