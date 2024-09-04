package com.app.Service.Impl;

import com.app.Repository.TimeSlotRepo;
import com.app.Service.TimeSlotService;
import com.app.model.TimeSlot;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class TimeSlotServiceImpl implements TimeSlotService {
    private final TimeSlotRepo timeSlotRepository;

    public TimeSlotServiceImpl(TimeSlotRepo timeSlotRepository) {
        this.timeSlotRepository = timeSlotRepository;
    }

    @Override
    public TimeSlot save(TimeSlot timeSlot) {
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
}
