package com.axa.sinistresmanagement.services;

import com.axa.sinistresmanagement.models.SinistrePerteFinanciere;
import com.axa.sinistresmanagement.repositories.SinistrePerteFinanciereRepository;
import com.axa.sinistresmanagement.exceptions.SinistreNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinistrePerteFinanciereService {
    private final SinistrePerteFinanciereRepository sinistrePerteFinanciereRepository;

    @Autowired
    public SinistrePerteFinanciereService(SinistrePerteFinanciereRepository sinistrePerteFinanciereRepository) {
        this.sinistrePerteFinanciereRepository = sinistrePerteFinanciereRepository;
    }

    public List<SinistrePerteFinanciere> findAll() {
        return sinistrePerteFinanciereRepository.findAll();
    }

    public SinistrePerteFinanciere findById(Long id) {
        return sinistrePerteFinanciereRepository.findById(id)
            .orElseThrow(() -> new SinistreNotFoundException("Sinistre not found with ID: " + id));
    }

    public SinistrePerteFinanciere save(SinistrePerteFinanciere sinistrePerteFinanciere) {
        return sinistrePerteFinanciereRepository.save(sinistrePerteFinanciere);
    }

    public SinistrePerteFinanciere update(Long id, SinistrePerteFinanciere sinistreDetails) {
        SinistrePerteFinanciere sinistre = sinistrePerteFinanciereRepository.findById(id)
            .orElseThrow(() -> new SinistreNotFoundException("Sinistre not found with ID: " + id));
        
        sinistre.setNomAssure(sinistreDetails.getNomAssure());
        sinistre.setPrenomAssure(sinistreDetails.getPrenomAssure());
        sinistre.setDateNaissance(sinistreDetails.getDateNaissance());
        sinistre.setAdressePostale(sinistreDetails.getAdressePostale());
        sinistre.setTelephone(sinistreDetails.getTelephone());
        sinistre.setEmail(sinistreDetails.getEmail());
        sinistre.setDateSinistre(sinistreDetails.getDateSinistre());
        sinistre.setNatureSinistre(sinistreDetails.getNatureSinistre());
        sinistre.setLieuSinistre(sinistreDetails.getLieuSinistre());
        sinistre.setDescription(sinistreDetails.getDescription());
        sinistre.setAdresseServiceSinistres(sinistreDetails.getAdresseServiceSinistres());
        sinistre.setEmailServiceSinistres(sinistreDetails.getEmailServiceSinistres());
        sinistre.setDeclarationVeracite(sinistreDetails.getDeclarationVeracite());
        sinistre.setDateSignature(sinistreDetails.getDateSignature());

        sinistre.setNumeroImmatriculation(sinistreDetails.getNumeroImmatriculation());
        sinistre.setFactureAchat(sinistreDetails.getFactureAchat());
        sinistre.setRapportExpertise(sinistreDetails.getRapportExpertise());
        sinistre.setLettreRemboursement(sinistreDetails.getLettreRemboursement());
        sinistre.setMontantFranchise(sinistreDetails.getMontantFranchise());

        return sinistrePerteFinanciereRepository.save(sinistre);
    }

    public void deleteById(Long id) {
        if (!sinistrePerteFinanciereRepository.existsById(id)) {
            throw new SinistreNotFoundException("Sinistre not found with ID: " + id);
        }
        sinistrePerteFinanciereRepository.deleteById(id);
    }
}
