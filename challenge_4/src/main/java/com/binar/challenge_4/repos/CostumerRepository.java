package com.binar.challenge_4.repos;

import com.binar.challenge_4.models.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CostumerRepository extends JpaRepository<Costumer, Integer> {
}
