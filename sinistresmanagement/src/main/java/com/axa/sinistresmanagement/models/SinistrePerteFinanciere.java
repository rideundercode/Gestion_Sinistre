package com.axa.sinistresmanagement.models;
import javax.persistence.*;

@Entity
public class SinistrePerteFinanciere extends Sinistre {
    private String numeroImmatriculation;
    private String factureAchat;
    private String rapportExpertise;
    private String lettreRemboursement;
    private Double montantFranchise;

    public String getNumeroImmatriculation() {
        return numeroImmatriculation;
    }

    public void setNumeroImmatriculation(String numeroImmatriculation) {
        this.numeroImmatriculation = numeroImmatriculation;
    }

    public String getFactureAchat() {
        return factureAchat;
    }

    public void setFactureAchat(String factureAchat) {
        this.factureAchat = factureAchat;
    }

    public String getRapportExpertise() {
        return rapportExpertise;
    }

    public void setRapportExpertise(String rapportExpertise) {
        this.rapportExpertise = rapportExpertise;
    }

    public String getLettreRemboursement() {
        return lettreRemboursement;
    }

    public void setLettreRemboursement(String lettreRemboursement) {
        this.lettreRemboursement = lettreRemboursement;
    }

    public Double getMontantFranchise() {
        return montantFranchise;
    }

    public void setMontantFranchise(Double montantFranchise) {
        this.montantFranchise = montantFranchise;
    }
}