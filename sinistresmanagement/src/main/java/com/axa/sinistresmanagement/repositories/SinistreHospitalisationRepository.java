package com.axa.sinistresmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.axa.sinistresmanagement.models.SinistreHospitalisation;

public interface SinistreHospitalisationRepository extends JpaRepository<SinistreHospitalisation, Long> {
}
