package com.axa.sinistresmanagement.models;
import javax.persistence.*;

@Entity
public class SinistrePTIA extends Sinistre {
    private Date dateInvalidite;
    private String motifInvalidite;
    private String notificationInvalidite;
    private String declarationMedicale;

    public Date getDateInvalidite() {
        return dateInvalidite;
    }

    public void setDateInvalidite(Date dateInvalidite) {
        this.dateInvalidite = dateInvalidite;
    }

    public String getMotifInvalidite() {
        return motifInvalidite;
    }

    public void setMotifInvalidite(String motifInvalidite) {
        this.motifInvalidite = motifInvalidite;
    }

    public String getNotificationInvalidite() {
        return notificationInvalidite;
    }

    public void setNotificationInvalidite(String notificationInvalidite) {
        this.notificationInvalidite = notificationInvalidite;
    }

    public String getDeclarationMedicale() {
        return declarationMedicale;
    }

    public void setDeclarationMedicale(String declarationMedicale) {
        this.declarationMedicale = declarationMedicale;
    }
}