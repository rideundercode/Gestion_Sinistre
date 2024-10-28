package com.axa.sinistresmanagement.services;

import com.axa.sinistresmanagement.exceptions.SinistreNotFoundException;
import com.axa.sinistresmanagement.models.SinistreDeces;
import com.axa.sinistresmanagement.repositories.SinistreDecesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinistreDecesService {
    private final SinistreDecesRepository sinistreDecesRepository;

    @Autowired
    public SinistreDecesService(SinistreDecesRepository sinistreDecesRepository) {
        this.sinistreDecesRepository = sinistreDecesRepository;
    }

    public List<SinistreDeces> findAll() {
        return sinistreDecesRepository.findAll();
    }

    public SinistreDeces save(SinistreDeces sinistreDeces) {
        return sinistreDecesRepository.save(sinistreDeces);
    }

    public SinistreDeces findById(Long id) {
        return sinistreDecesRepository.findById(id)
            .orElseThrow(() -> new SinistreNotFoundException("Sinistre not found with ID: " + id));
    }

    public SinistreDeces update(Long id, SinistreDeces sinistreDetails) {
        SinistreDeces sinistre = sinistreDecesRepository.findById(id)
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

        sinistre.setDateDeces(sinistreDetails.getDateDeces());
        sinistre.setCauseDeces(sinistreDetails.getCauseDeces());
        sinistre.setActeDeces(sinistreDetails.getActeDeces());
        sinistre.setProcesVerbal(sinistreDetails.getProcesVerbal());

        return sinistreDecesRepository.save(sinistre);
    }

    public void deleteById(Long id) {
        if (!sinistreDecesRepository.existsById(id)) {
            throw new SinistreNotFoundException("Sinistre not found with ID: " + id);
        }
        sinistreDecesRepository.deleteById(id);
    }
}
