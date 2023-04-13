package com.binar.challenge_4.service;

import com.binar.challenge_4.models.Costumer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CostumerServiceImpl implements CostumerService{
    @Override
    public Page<Costumer> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Costumer findById(int id) {
        return null;
    }

    @Override
    public Costumer save(Costumer costumer) {
        return null;
    }

    @Override
    public Costumer update(Costumer updatedCostumer) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
