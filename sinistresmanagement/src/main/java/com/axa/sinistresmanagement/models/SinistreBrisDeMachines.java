package com.axa.sinistresmanagement.models;

import javax.persistence.*;

@Entity
public class SinistreBrisDeMachines extends Sinistre {
    private String modeleMachine;
    private String numeroSerie;
    private String typeDommage;
    private String devisReparations;
    private String recepissePlainte;

    // Getters
    public String getModeleMachine() {
        return modeleMachine;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getTypeDommage() {
        return typeDommage;
    }

    public String getDevisReparations() {
        return devisReparations;
    }

    public String getRecepissePlainte() {
        return recepissePlainte;
    }

    // Setters
    public void setModeleMachine(String modeleMachine) {
        this.modeleMachine = modeleMachine;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public void setTypeDommage(String typeDommage) {
        this.typeDommage = typeDommage;
    }

    public void setDevisReparations(String devisReparations) {
        this.devisReparations = devisReparations;
    }

    public void setRecepissePlainte(String recepissePlainte) {
        this.recepissePlainte = recepissePlainte;
    }
}
