package com.example.physiobase2.infrastructure;

import com.example.physiobase2.infrastructure.model.PatientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientEntity> getAllPatients() {
        return patientRepository.findAll();
    }

    public PatientEntity savePatient(PatientEntity patient) {
        return patientRepository.save(patient);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillPatientsTable() {
        patientRepository.save(new PatientEntity("Jan Kowalski", "Male"));
        patientRepository.save(new PatientEntity("Tomasz Gałecki", "Male"));
    }
}
