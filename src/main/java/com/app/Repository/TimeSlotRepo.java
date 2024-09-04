package com.app.Repository;

import com.app.model.TimeSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeSlotRepo extends JpaRepository<TimeSlot,Long>,JpaSpecificationExecutor<TimeSlot> {

}
