package com.app.Service;


import com.app.model.Patient;
import org.springframework.stereotype.Service;

@Service
public interface PatientService {
    Patient getPatientByPhoneNumber(String phoneNumber);
}
