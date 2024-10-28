package com.axa.sinistresmanagement.models;
import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) // Cette stratégie est efficace pour les cas où les sous-classes ont des attributs distincts.
public abstract class Sinistre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomAssure;
    private String prenomAssure;
    private Date dateNaissance;
    private String adressePostale;
    private String telephone;
    private String email;

    private Date dateSinistre;
    private String natureSinistre;
    private String lieuSinistre;
    private String description;
    private String adresseServiceSinistres;
    private String emailServiceSinistres;

    private String declarationVeracite;
    private Date dateSignature;

    //GETTERS
    public Long getId() { return id; }
    public String getNomAssure() { return nomAssure; }
    public String getPrenomAssure() { return prenomAssure; }
    public Date getDateNaissance() { return dateNaissance; }
    public String getAdressePostale() { return adressePostale; }
    public String getTelephone() { return telephone; }
    public String getEmail() { return email; }
    public Date getDateSinistre() { return dateSinistre; }
    public String getNatureSinistre() { return natureSinistre; }
    public String getLieuSinistre() { return lieuSinistre; }
    public String getDescription() { return description; }
    public String getAdresseServiceSinistres() { return adresseServiceSinistres; }
    public String getEmailServiceSinistres() { return emailServiceSinistres; }
    public String getDeclarationVeracite() { return declarationVeracite; }
    public Date getDateSignature() { return dateSignature; }

    //SETTERS
    public void setId(Long id) { this.id = id; }
    public void setNomAssure(String nomAssure) { this.nomAssure = nomAssure; }
    public void setPrenomAssure(String prenomAssure) { this.prenomAssure = prenomAssure; }
    public void setDateNaissance(Date dateNaissance) { this.dateNaissance = dateNaissance; }
    public void setAdressePostale(String adressePostale) { this.adressePostale = adressePostale; }
    public void setTelephone(String telephone) { this.telephone = telephone; }
    public void setEmail(String email) { this.email = email; }
    public void setDateSinistre(Date dateSinistre) { this.dateSinistre = dateSinistre; }
    public void setNatureSinistre(String natureSinistre) { this.natureSinistre = natureSinistre; }
    public void setLieuSinistre(String lieuSinistre) { this.lieuSinistre = lieuSinistre; }
    public void setDescription(String description) { this.description = description; }
    public void setAdresseServiceSinistres(String adresseServiceSinistres) { this.adresseServiceSinistres = adresseServiceSinistres; }
    public void setEmailServiceSinistres(String emailServiceSinistres) { this.emailServiceSinistres = emailServiceSinistres; }
    public void setDeclarationVeracite(String declarationVeracite) { this.declarationVeracite = declarationVeracite; }
    public void setDateSignature(Date dateSignature) { this.dateSignature = dateSignature; }
    
}