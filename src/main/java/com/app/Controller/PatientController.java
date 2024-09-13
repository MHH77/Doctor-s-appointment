package com.app.Controller;


import com.app.Service.PatientService;
import com.app.model.Patient;
import com.app.model.dto.BaseResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/patients")
@RequiredArgsConstructor
public class PatientController {

    private final PatientService patientService;

    @GetMapping(value = "/{phoneNumber}")
    public ResponseEntity<BaseResponseDTO> getPatientByPhoneNumber(@PathVariable(value = "phoneNumber") String phoneNumber) {
        Patient patient = patientService.getPatientByPhoneNumber(phoneNumber);
        return ResponseEntity.status(HttpStatus.OK).body(BaseResponseDTO.builder()
                .message("found")
                .result(patient).build());
    }
}
