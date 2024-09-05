package com.app.Controller;


import com.app.Service.TimeSlotService;
import com.app.model.TimeSlot;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/time-slots")
@RequiredArgsConstructor
public class TimeSlotController {

    private final TimeSlotService timeSlotService;

    @PostMapping("/add")
    public ResponseEntity<TimeSlot> addTimeSlot(@RequestBody TimeSlot timeSlot) {
        return ResponseEntity.ok(timeSlotService.save(timeSlot));
    }

    @PutMapping("/update")
    public ResponseEntity<TimeSlot> updateTimeSlot(@RequestBody TimeSlot timeSlot) {
        return ResponseEntity.ok(timeSlotService.update(timeSlot));
    }

    @DeleteMapping("/delete-by-id/{id}")
    public ResponseEntity<Void> deleteTimeSlot(@PathVariable Long id) {
        timeSlotService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<Optional<TimeSlot>> getTimeslotById(@PathVariable Long id) {
        return ResponseEntity.ok(timeSlotService.getById(id));
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<TimeSlot>> allTimeSlot() {
        return ResponseEntity.ok(timeSlotService.all());
    }

}
