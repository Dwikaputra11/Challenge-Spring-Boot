package com.binar.challenge_4.service;

import com.binar.challenge_4.models.Payment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PaymentService {

    Page<Payment> findAll(Pageable pageable);

    Payment findById(int id);

    Payment save(Payment payment);

    Payment update(Payment updatedPayment);

    void delete(int id);
}
