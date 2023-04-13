package com.binar.challenge_4.repos;

import com.binar.challenge_4.models.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {
}
