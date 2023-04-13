package com.binar.challenge_4.service;

import com.binar.challenge_4.models.Costumer;
import com.binar.challenge_4.models.Staff;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StaffService {
    Page<Staff> findAll(Pageable pageable);

    Staff findById(int id);

    Staff save(Staff staff);

    Staff update(Staff updatedStaff);

    void delete(int id);
}
