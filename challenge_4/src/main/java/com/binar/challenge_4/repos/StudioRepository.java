package com.binar.challenge_4.repos;

import com.binar.challenge_4.models.Studio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudioRepository extends JpaRepository<Studio, Integer> {
}
