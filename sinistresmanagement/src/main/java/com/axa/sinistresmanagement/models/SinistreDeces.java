package com.axa.sinistresmanagement.models;
import javax.persistence.*;

@Entity
public class SinistreDeces extends Sinistre {
    private Date dateDeces;
    private String causeDeces;
    private String acteDeces;
    private String procesVerbal;

    public Date getDateDeces() {
        return dateDeces;
    }

    public void setDateDeces(Date dateDeces) {
        this.dateDeces = dateDeces;
    }

    public String getCauseDeces() {
        return causeDeces;
    }

    public void setCauseDeces(String causeDeces) {
        this.causeDeces = causeDeces;
    }

    public String getActeDeces() {
        return acteDeces;
    }

    public void setActeDeces(String acteDeces) {
        this.acteDeces = acteDeces;
    }

    public String getProcesVerbal() {
        return procesVerbal;
    }

    public void setProcesVerbal(String procesVerbal) {
        this.procesVerbal = procesVerbal;
    }
}