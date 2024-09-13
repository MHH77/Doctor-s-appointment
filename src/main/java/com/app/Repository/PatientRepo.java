package com.app.Repository;


import com.app.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepo extends JpaRepository<Patient,Long>, JpaSpecificationExecutor<Patient> {

    Optional<Patient> findPatientByPhoneNumber(String phoneNumber);
}
