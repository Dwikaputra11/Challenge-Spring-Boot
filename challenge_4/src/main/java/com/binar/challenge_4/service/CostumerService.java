package com.binar.challenge_4.service;

import com.binar.challenge_4.models.Costumer;
import com.binar.challenge_4.models.Film;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CostumerService {

    Page<Costumer> findAll(Pageable pageable);

    Costumer findById(int id);

    Costumer save(Costumer costumer);

    Costumer update(Costumer updatedCostumer);

    void delete(int id);
}
