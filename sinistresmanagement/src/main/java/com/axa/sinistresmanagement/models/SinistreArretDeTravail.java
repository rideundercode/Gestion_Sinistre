package com.axa.sinistresmanagement.models;
import javax.persistence.*;

@Entity
public class SinistreArretDeTravail extends Sinistre {
    private Date dateArret;
    private String certificatsArret;
    private String decompteIndemnites;
    private String declarationMedicale;

    public Date getDateArret() {
        return dateArret;
    }

    public void setDateArret(Date dateArret) {
        this.dateArret = dateArret;
    }

    public String getCertificatsArret() {
        return certificatsArret;
    }

    public void setCertificatsArret(String certificatsArret) {
        this.certificatsArret = certificatsArret;
    }

    public String getDecompteIndemnites() {
        return decompteIndemnites;
    }

    public void setDecompteIndemnites(String decompteIndemnites) {
        this.decompteIndemnites = decompteIndemnites;
    }

    public String getDeclarationMedicale() {
        return declarationMedicale;
    }

    public void setDeclarationMedicale(String declarationMedicale) {
        this.declarationMedicale = declarationMedicale;
    }
}