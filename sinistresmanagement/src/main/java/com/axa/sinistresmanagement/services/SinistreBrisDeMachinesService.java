package com.axa.sinistresmanagement.services;

import com.axa.sinistresmanagement.models.SinistreBrisDeMachines;
import com.axa.sinistresmanagement.repositories.SinistreBrisDeMachinesRepository;
import com.axa.sinistresmanagement.exceptions.SinistreNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinistreBrisDeMachinesService {
    private final SinistreBrisDeMachinesRepository sinistreBrisDeMachinesRepository;

    @Autowired
    public SinistreBrisDeMachinesService(SinistreBrisDeMachinesRepository sinistreBrisDeMachinesRepository) {
        this.sinistreBrisDeMachinesRepository = sinistreBrisDeMachinesRepository;
    }

    public List<SinistreBrisDeMachines> findAll() {
        return sinistreBrisDeMachinesRepository.findAll();
    }

    public SinistreBrisDeMachines save(SinistreBrisDeMachines sinistreBrisDeMachines) {
        return sinistreBrisDeMachinesRepository.save(sinistreBrisDeMachines);
    }

    public SinistreBrisDeMachines findById(Long id) {
        return sinistreBrisDeMachinesRepository.findById(id)
            .orElseThrow(() -> new SinistreNotFoundException("Sinistre not found with ID: " + id));
    }

    public SinistreBrisDeMachines update(Long id, SinistreBrisDeMachines sinistreDetails) {
        SinistreBrisDeMachines sinistre = sinistreBrisDeMachinesRepository.findById(id)
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

        sinistre.setModeleMachine(sinistreDetails.getModeleMachine());
        sinistre.setNumeroSerie(sinistreDetails.getNumeroSerie());
        sinistre.setTypeDommage(sinistreDetails.getTypeDommage());
        sinistre.setDevisReparations(sinistreDetails.getDevisReparations());
        sinistre.setRecepissePlainte(sinistreDetails.getRecepissePlainte());

        return sinistreBrisDeMachinesRepository.save(sinistre);
    }

    public void deleteById(Long id) {
        if (!sinistreBrisDeMachinesRepository.existsById(id)) {
            throw new SinistreNotFoundException("Sinistre not found with ID: " + id);
        }
        sinistreBrisDeMachinesRepository.deleteById(id);
    }
}
