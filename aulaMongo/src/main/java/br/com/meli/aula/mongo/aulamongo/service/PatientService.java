package br.com.meli.aula.mongo.aulamongo.service;

import br.com.meli.aula.mongo.aulamongo.model.Patient;
import br.com.meli.aula.mongo.aulamongo.repository.DiaryRepository;
import br.com.meli.aula.mongo.aulamongo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    private PatientRepository patientRepository;

    @Autowired
    PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public void insert(Patient patient){
        this.patientRepository.insert(patient);
    }
}
