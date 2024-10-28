package com.axa.sinistresmanagement.models;
import javax.persistence.*;

@Entity
public class SinistreHospitalisation extends Sinistre {
    private Date dateEntree;
    private Date dateSortie;
    private String bulletinsSituation;
    private String compteRenduHospitalisation;
    private String motifHospitalisation;

    public Date getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    public String getBulletinsSituation() {
        return bulletinsSituation;
    }

    public void setBulletinsSituation(String bulletinsSituation) {
        this.bulletinsSituation = bulletinsSituation;
    }

    public String getCompteRenduHospitalisation() {
        return compteRenduHospitalisation;
    }

    public void setCompteRenduHospitalisation(String compteRenduHospitalisation) {
        this.compteRenduHospitalisation = compteRenduHospitalisation;
    }

    public String getMotifHospitalisation() {
        return motifHospitalisation;
    }

    public void setMotifHospitalisation(String motifHospitalisation) {
        this.motifHospitalisation = motifHospitalisation;
    }
}