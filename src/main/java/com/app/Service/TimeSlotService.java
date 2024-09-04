package com.app.Service;

import com.app.model.TimeSlot;

import java.util.List;
import java.util.Optional;

public interface TimeSlotService  {
    TimeSlot save(TimeSlot timeSlot);
    TimeSlot update(TimeSlot timeSlot);
    void delete(Long id);
    Optional<TimeSlot> getById(Long id);
    List<TimeSlot> all();
}
