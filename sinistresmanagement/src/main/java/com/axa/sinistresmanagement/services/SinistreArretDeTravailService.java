package com.axa.sinistresmanagement.services;

import com.axa.sinistresmanagement.models.SinistreArretDeTravail;
import com.axa.sinistresmanagement.repositories.SinistreArretDeTravailRepository;
import com.axa.sinistresmanagement.exceptions.SinistreNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinistreArretDeTravailService {
    private final SinistreArretDeTravailRepository sinistreArretDeTravailRepository;

    @Autowired
    public SinistreArretDeTravailService(SinistreArretDeTravailRepository sinistreArretDeTravailRepository) {
        this.sinistreArretDeTravailRepository = sinistreArretDeTravailRepository;
    }

    public List<SinistreArretDeTravail> findAll() {
        return sinistreArretDeTravailRepository.findAll();
    }

    public SinistreArretDeTravail save(SinistreArretDeTravail sinistreArretDeTravail) {
        return sinistreArretDeTravailRepository.save(sinistreArretDeTravail);
    }

    public SinistreArretDeTravail findById(Long id) {
        return sinistreArretDeTravailRepository.findById(id)
            .orElseThrow(() -> new SinistreNotFoundException("Sinistre not found with ID: " + id));
    }

    public SinistreArretDeTravail update(Long id, SinistreArretDeTravail sinistreDetails) {
        SinistreArretDeTravail sinistre = sinistreArretDeTravailRepository.findById(id)
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

        sinistre.setDateArret(sinistreDetails.getDateArret());
        sinistre.setCertificatsArret(sinistreDetails.getCertificatsArret());
        sinistre.setDecompteIndemnites(sinistreDetails.getDecompteIndemnites());
        sinistre.setDeclarationMedicale(sinistreDetails.getDeclarationMedicale());

        return sinistreArretDeTravailRepository.save(sinistre);
    }

    public void deleteById(Long id) {
        if (!sinistreArretDeTravailRepository.existsById(id)) {
            throw new SinistreNotFoundException("Sinistre not found with ID: " + id);
        }
        sinistreArretDeTravailRepository.deleteById(id);
    }
}
