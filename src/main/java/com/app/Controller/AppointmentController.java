package com.app.Controller;

import com.app.Service.AppointmentService;
import com.app.model.Appointment;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/appointment")
@RequiredArgsConstructor
public class AppointmentController {

    private final AppointmentService appointmentService;

    @PostMapping("/add")
    public ResponseEntity<Appointment> addTimeSlot(@RequestBody Appointment appointment) {
        return ResponseEntity.ok(appointmentService.save(appointment));
    }

    @PutMapping("/update")
    public ResponseEntity<Appointment> updateTimeSlot(@RequestBody Appointment appointment) {
        return ResponseEntity.ok(appointmentService.update(appointment));
    }

    @DeleteMapping("/delete-by-id/{id}")
    public ResponseEntity<Void> deleteTimeSlot(@PathVariable Long id) {
        appointmentService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<Optional<Appointment>> getTimeslotById(@PathVariable Long id) {
        return ResponseEntity.ok(appointmentService.getById(id));
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Appointment>> allTimeSlot() {
        return ResponseEntity.ok(appointmentService.all());
    }



}
