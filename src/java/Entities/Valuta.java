/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author danielthomsen1990
 */
@Entity
@Table(name = "VALUTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Valuta.findAll", query = "SELECT v FROM Valuta v")})
public class Valuta implements Serializable {
    @Column(name = "RATE")
    private Integer rate;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "VALUTA")
    private String valuta;
    @Size(max = 3)
    @Column(name = "ISOCODE")
    private String isocode;
    

    public Valuta() {
    }

    public Valuta(String valuta) {
        this.valuta = valuta;
    }

    public String getValuta() {
        return valuta;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }

    public String getIsocode() {
        return isocode;
    }

    public void setIsocode(String isocode) {
        this.isocode = isocode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (valuta != null ? valuta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Valuta)) {
            return false;
        }
        Valuta other = (Valuta) object;
        if ((this.valuta == null && other.valuta != null) || (this.valuta != null && !this.valuta.equals(other.valuta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Valuta[ valuta=" + valuta + " ]";
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }
    
}
