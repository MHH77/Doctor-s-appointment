package com.app.Service;

import com.app.model.Appointment;

import java.util.List;
import java.util.Optional;

public interface AppointmentService {
    Appointment save(Appointment appointment);
    Appointment update(Appointment appointment);
    void delete(Long id);
    Optional<Appointment> getById(Long id);
    List<Appointment> all();
}
