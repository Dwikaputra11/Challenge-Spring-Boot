package com.binar.challenge_4.controller;

import com.binar.challenge_4.models.Payment;
import com.binar.challenge_4.service.PaymentService;
import com.binar.challenge_4.utils.ResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PaymentController {
    private PaymentService paymentService;
    private static final String SUCCESS_RETRIEVE_MSG = "Successfully retrieved data!";
    private static final String SUCCESS_EDIT_MSG = "Successfully edit data!";

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/payment")
    public ResponseEntity<Object> findAll(
            @RequestParam(defaultValue ="0") int page,
            @RequestParam(defaultValue ="10") int size
    ){
        Page<Payment> payments;
        Pageable pageable = PageRequest.of(page, size);
        payments = paymentService.findAll(pageable);

        return ResponseHandler.generatePagingResponse(SUCCESS_RETRIEVE_MSG, HttpStatus.OK,payments);
    }

    @GetMapping("/payment/{id}")
    public ResponseEntity<Object> findAll(@PathVariable("id") int id){

        var data = paymentService.findById(id);

        return ResponseHandler.generateResponse(SUCCESS_RETRIEVE_MSG, HttpStatus.OK,data);
    }

    @PostMapping("/payment")
    public ResponseEntity<Object> save(@RequestBody Payment payment){
        var data = paymentService.save(payment);
        return ResponseHandler.generateResponse(SUCCESS_EDIT_MSG, HttpStatus.OK, data);
    }

    @PutMapping("/payment")
    public ResponseEntity<Object> update(@RequestBody Payment payment){
        var data = paymentService.update(payment);
        return ResponseHandler.generateResponse(SUCCESS_EDIT_MSG, HttpStatus.OK, data);
    }

    @DeleteMapping("/payment/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") int id){
        paymentService.delete(id);
        return ResponseHandler.generateResponse(SUCCESS_EDIT_MSG, HttpStatus.OK, id);
    }

}
