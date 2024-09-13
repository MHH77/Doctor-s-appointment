package com.app.exception;

import com.app.global.BusinessException;
import com.app.global.ErrorResponse;
import org.springframework.http.HttpStatus;

public class PatientException extends BusinessException {
    public PatientException(){
        super(new ErrorResponse(
                "not found",
                HttpStatus.NOT_FOUND
        ));
    }
}
