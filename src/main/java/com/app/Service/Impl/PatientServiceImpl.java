package com.app.Service.Impl;

import com.app.Repository.PatientRepo;
import com.app.Service.PatientService;
import com.app.exception.PatientException;
import com.app.model.Patient;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final PatientRepo patientRepo;

    @Override
    public Patient getPatientByPhoneNumber(String phoneNumber) {
       return patientRepo.findPatientByPhoneNumber(phoneNumber).orElseThrow(PatientException::new);
    }
}
