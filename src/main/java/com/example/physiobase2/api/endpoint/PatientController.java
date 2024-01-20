package com.example.physiobase2.api.endpoint;

import com.example.physiobase2.infrastructure.PatientService;
import com.example.physiobase2.infrastructure.model.PatientEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/patient")
class PatientController {

    private final PatientService patientService;



    @GetMapping("/all")
    public List<PatientEntity> getAllPatients() {
        return patientService.getAllPatients();
    }

    @PostMapping()
    public PatientEntity savePatient(@RequestBody PatientEntity patient) {
        return patientService.savePatient(patient);
    }
}
