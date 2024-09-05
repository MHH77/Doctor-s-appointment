package com.app.Service.Impl;

import com.app.Repository.AppointmentRepo;
import com.app.Service.AppointmentService;
import com.app.model.Appointment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepo appointmentRepo;

    @Override
    public Appointment save(Appointment appointment) {
        return appointmentRepo.save(appointment);
    }

    @Override
    public Appointment update(Appointment appointment) {
        return appointmentRepo.save(appointment);
    }

    @Override
    public void delete(Long id) {
        appointmentRepo.deleteById(id);
    }

    @Override
    public Optional<Appointment> getById(Long id) {
        return appointmentRepo.findById(id);
    }

    @Override
    public List<Appointment> all() {
        return appointmentRepo.findAll();
    }
}
