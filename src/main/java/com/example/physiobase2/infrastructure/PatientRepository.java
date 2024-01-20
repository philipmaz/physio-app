package com.example.physiobase2.infrastructure;

import com.example.physiobase2.infrastructure.model.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PatientRepository extends JpaRepository<PatientEntity, Long> {
}
