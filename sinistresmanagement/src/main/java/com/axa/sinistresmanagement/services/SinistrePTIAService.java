package com.axa.sinistresmanagement.services;

import com.axa.sinistresmanagement.models.SinistrePTIA;
import com.axa.sinistresmanagement.repositories.SinistresPtiaRepository;
import com.axa.sinistresmanagement.exceptions.SinistreNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinistrePTIAService {
    private final SinistresPtiaRepository sinistresPtiaRepository;

    @Autowired
    public SinistrePTIAService(SinistresPtiaRepository sinistresPtiaRepository) {
        this.sinistresPtiaRepository = sinistresPtiaRepository;
    }

    public List<SinistrePTIA> findAll() {
        return sinistresPtiaRepository.findAll();
    }

    public SinistrePTIA findById(Long id) {
        return sinistresPtiaRepository.findById(id)
            .orElseThrow(() -> new SinistreNotFoundException("Sinistre not found with ID: " + id));
    }

    public SinistrePTIA save(SinistrePTIA sinistresPtia) {
        return sinistresPtiaRepository.save(sinistresPtia);
    }

    public SinistrePTIA update(Long id, SinistrePTIA sinistreDetails) {
        SinistrePTIA sinistre = sinistresPtiaRepository.findById(id)
            .orElseThrow(() -> new SinistreNotFoundException("Sinistre not found with ID: " + id));
        
        // Mise à jour des attributs hérités de Sinistre
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

        // Mise à jour des attributs spécifiques à SinistrePTIA
        sinistre.setDateInvalidite(sinistreDetails.getDateInvalidite());
        sinistre.setMotifInvalidite(sinistreDetails.getMotifInvalidite());
        sinistre.setNotificationInvalidite(sinistreDetails.getNotificationInvalidite());
        sinistre.setDeclarationMedicale(sinistreDetails.getDeclarationMedicale());

        // Enregistrer les modifications dans la base de données
        return sinistresPtiaRepository.save(sinistre);
    }

    public void deleteById(Long id) {
        if (!sinistresPtiaRepository.existsById(id)) {
            throw new SinistreNotFoundException("Sinistre not found with ID: " + id);
        }
        sinistresPtiaRepository.deleteById(id);
    }
}
