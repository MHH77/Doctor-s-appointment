package com.app.Service.Impl;

import com.app.Repository.AppointmentRepo;
import com.app.Repository.TimeSlotRepo;
import com.app.Service.TimeSlotService;
import com.app.model.Appointment;
import com.app.model.Enums.AppointmentStatus;
import com.app.model.TimeSlot;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TimeSlotServiceImpl implements TimeSlotService {

    private final TimeSlotRepo timeSlotRepository;
    private final AppointmentRepo appointmentRepo;

    @Override
    public TimeSlot save(TimeSlot timeSlot) {
        this.splitTime(timeSlot);
        return timeSlotRepository.save(timeSlot);
    }

    @Override
    public TimeSlot update(TimeSlot timeSlot) {
        return timeSlotRepository.save(timeSlot);
    }

    @Override
    public void delete(Long id) {
        timeSlotRepository.deleteById(id);
    }

    @Override
    public Optional<TimeSlot> getById(Long id) {
        return timeSlotRepository.findById(id);
    }

    @Override
    public List<TimeSlot> all() {
        return timeSlotRepository.findAll();
    }

    @Override
    public void splitTime(TimeSlot timeSlot) {
        LocalDateTime startDateTime = timeSlot.getStartTime().atDate(timeSlot.getDate());
        LocalDateTime endDateTime = timeSlot.getEndTime().atDate(timeSlot.getDate());
        List<Appointment> availableAppointments = new ArrayList<>();

        while (!startDateTime.isAfter(endDateTime)) {
            Appointment appointment = new Appointment();
            appointment.setStartTime(startDateTime);
            appointment.setEndTime(startDateTime.plusMinutes(30));
            appointment.setStatus(AppointmentStatus.OPEN);
            appointment.setTimeSlot(timeSlot);

            availableAppointments.add(appointment);
            startDateTime = startDateTime.plusMinutes(30);
        }

        appointmentRepo.saveAll(availableAppointments);

    }
}
