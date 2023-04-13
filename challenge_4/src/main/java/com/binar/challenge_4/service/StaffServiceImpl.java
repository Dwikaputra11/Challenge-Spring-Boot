package com.binar.challenge_4.service;

import com.binar.challenge_4.models.Staff;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceImpl implements StaffService{
    @Override
    public Page<Staff> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Staff findById(int id) {
        return null;
    }

    @Override
    public Staff save(Staff staff) {
        return null;
    }

    @Override
    public Staff update(Staff updatedStaff) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
