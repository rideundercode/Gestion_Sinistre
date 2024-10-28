package com.axa.sinistresmanagement.services;

import com.axa.sinistresmanagement.models.SinistrePerteEmploi;
import com.axa.sinistresmanagement.repositories.SinistrePerteEmploiRepository;
import com.axa.sinistresmanagement.exceptions.SinistreNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinistrePerteEmploiService {
    private final SinistrePerteEmploiRepository sinistrePerteEmploiRepository;

    @Autowired
    public SinistrePerteEmploiService(SinistrePerteEmploiRepository sinistrePerteEmploiRepository) {
        this.sinistrePerteEmploiRepository = sinistrePerteEmploiRepository;
    }

    public List<SinistrePerteEmploi> findAll() {
        return sinistrePerteEmploiRepository.findAll();
    }

    public SinistrePerteEmploi findById(Long id) {
        return sinistrePerteEmploiRepository.findById(id)
            .orElseThrow(() -> new SinistreNotFoundException("Sinistre not found with ID: " + id));
    }

    public SinistrePerteEmploi save(SinistrePerteEmploi sinistrePerteEmploi) {
        return sinistrePerteEmploiRepository.save(sinistrePerteEmploi);
    }

    public SinistrePerteEmploi update(Long id, SinistrePerteEmploi sinistreDetails) {
        SinistrePerteEmploi sinistre = sinistrePerteEmploiRepository.findById(id)
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

        sinistre.setDateLicenciement(sinistreDetails.getDateLicenciement());
        sinistre.setRaisonPerteEmploi(sinistreDetails.getRaisonPerteEmploi());
        sinistre.setCopieContratTravail(sinistreDetails.getCopieContratTravail());
        sinistre.setLettreLicenciement(sinistreDetails.getLettreLicenciement());
        sinistre.setNotificationPoleEmploi(sinistreDetails.getNotificationPoleEmploi());
        sinistre.setDecomptePrestations(sinistreDetails.getDecomptePrestations());

        return sinistrePerteEmploiRepository.save(sinistre);
    }

    public void deleteById(Long id) {
        if (!sinistrePerteEmploiRepository.existsById(id)) {
            throw new SinistreNotFoundException("Sinistre not found with ID: " + id);
        }
        sinistrePerteEmploiRepository.deleteById(id);
    }
}
