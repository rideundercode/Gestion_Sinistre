package com.axa.sinistresmanagement.models;
import javax.persistence.*;

@Entity
public class SinistrePerteEmploi extends Sinistre {
    private Date dateLicenciement;
    private String raisonPerteEmploi;
    private String copieContratTravail;
    private String lettreLicenciement;
    private String notificationPoleEmploi;
    private String decomptePrestations;

    public Date getDateLicenciement() {
        return dateLicenciement;
    }

    public void setDateLicenciement(Date dateLicenciement) {
        this.dateLicenciement = dateLicenciement;
    }

    public String getRaisonPerteEmploi() {
        return raisonPerteEmploi;
    }

    public void setRaisonPerteEmploi(String raisonPerteEmploi) {
        this.raisonPerteEmploi = raisonPerteEmploi;
    }

    public String getCopieContratTravail() {
        return copieContratTravail;
    }

    public void setCopieContratTravail(String copieContratTravail) {
        this.copieContratTravail = copieContratTravail;
    }

    public String getLettreLicenciement() {
        return lettreLicenciement;
    }

    public void setLettreLicenciement(String lettreLicenciement) {
        this.lettreLicenciement = lettreLicenciement;
    }

    public String getNotificationPoleEmploi() {
        return notificationPoleEmploi;
    }

    public void setNotificationPoleEmploi(String notificationPoleEmploi) {
        this.notificationPoleEmploi = notificationPoleEmploi;
    }

    public String getDecomptePrestations() {
        return decomptePrestations;
    }

    public void setDecomptePrestations(String decomptePrestations) {
        this.decomptePrestations = decomptePrestations;
    }
}
