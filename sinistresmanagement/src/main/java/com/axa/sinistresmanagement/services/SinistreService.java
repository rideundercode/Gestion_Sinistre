package com.axa.sinistresmanagement.services;

import com.axa.sinistresmanagement.exceptions.SinistreNotFoundException;
import com.axa.sinistresmanagement.models.Sinistre;
import com.axa.sinistresmanagement.repositories.SinistreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinistreService {
    private final SinistreRepository sinistreRepository;

    @Autowired
    public SinistreService(SinistreRepository sinistreRepository) {
        this.sinistreRepository = sinistreRepository;
    }

    public List<Sinistre> findAll() {
        return sinistreRepository.findAll();
    }

    public Sinistre save(Sinistre sinistre) {
        return sinistreRepository.save(sinistre);
    }

    public Sinistre findById(Long id) {
        return sinistreRepository.findById(id)
            .orElseThrow(() -> new SinistreNotFoundException("Sinistre not found with ID: " + id));
    }

    public void deleteById(Long id) {
        if (!sinistreRepository.existsById(id)) {
            throw new SinistreNotFoundException("Sinistre not found with ID: " + id);
        }
        sinistreRepository.deleteById(id);
    }

    public Sinistre update(Long id, Sinistre sinistreDetails) {
        Sinistre sinistre = sinistreRepository.findById(id)
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

        return sinistreRepository.save(sinistre);
    }
}
