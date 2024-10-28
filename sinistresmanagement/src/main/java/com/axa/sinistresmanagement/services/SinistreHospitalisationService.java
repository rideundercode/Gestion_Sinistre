package com.axa.sinistresmanagement.services;

import com.axa.sinistresmanagement.models.SinistreHospitalisation;
import com.axa.sinistresmanagement.repositories.SinistreHospitalisationRepository;
import com.axa.sinistresmanagement.exceptions.SinistreNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinistreHospitalisationService {
    private final SinistreHospitalisationRepository sinistreHospitalisationRepository;

    @Autowired
    public SinistreHospitalisationService(SinistreHospitalisationRepository sinistreHospitalisationRepository) {
        this.sinistreHospitalisationRepository = sinistreHospitalisationRepository;
    }

    public List<SinistreHospitalisation> findAll() {
        return sinistreHospitalisationRepository.findAll();
    }

    public SinistreHospitalisation findById(Long id) {
        return sinistreHospitalisationRepository.findById(id)
             .orElseThrow(() -> new SinistreNotFoundException("Sinistre not found with ID: " + id));
    }

    public SinistreHospitalisation save(SinistreHospitalisation sinistreHospitalisation) {
        return sinistreHospitalisationRepository.save(sinistreHospitalisation);
    }

    public SinistreHospitalisation update(Long id, SinistreHospitalisation sinistreDetails) {
        SinistreHospitalisation sinistre = sinistreHospitalisationRepository.findById(id)
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

        sinistre.setDateEntree(sinistreDetails.getDateEntree());
        sinistre.setDateSortie(sinistreDetails.getDateSortie());
        sinistre.setBulletinsSituation(sinistreDetails.getBulletinsSituation());
        sinistre.setCompteRenduHospitalisation(sinistreDetails.getCompteRenduHospitalisation());
        sinistre.setMotifHospitalisation(sinistreDetails.getMotifHospitalisation());

        return sinistreHospitalisationRepository.save(sinistre);
    }

    public void deleteById(Long id) {
        if (!sinistreHospitalisationRepository.existsById(id)) {
            throw new SinistreNotFoundException("Sinistre not found with ID: " + id);
        }
        sinistreHospitalisationRepository.deleteById(id);
    }
}
