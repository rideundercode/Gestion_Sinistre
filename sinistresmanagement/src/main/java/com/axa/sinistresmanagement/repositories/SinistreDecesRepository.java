package com.axa.sinistresmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.axa.sinistresmanagement.models.SinistreDeces;

public interface SinistreDecesRepository extends JpaRepository<SinistreDeces, Long> {
}
