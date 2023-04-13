package com.binar.challenge_4.controller;

import com.binar.challenge_4.models.Costumer;
import com.binar.challenge_4.service.CostumerService;
import com.binar.challenge_4.utils.ResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class CostumerController {
    private final CostumerService costumerService;
    private static final String SUCCESS_RETRIEVE_MSG = "Successfully retrieved data!";
    private static final String SUCCESS_EDIT_MSG = "Successfully edit data!";

    @Autowired
    public CostumerController(CostumerService costumerService) {
        this.costumerService = costumerService;
    }

    @GetMapping("/costumer")
    public ResponseEntity<Object> findAll(
            @RequestParam(defaultValue ="0") int page,
            @RequestParam(defaultValue ="10") int size
    ){
        Page<Costumer> filmList;
        Pageable pageable = PageRequest.of(page, size);
        filmList = costumerService.findAll(pageable);

        return ResponseHandler.generatePagingResponse(SUCCESS_RETRIEVE_MSG, HttpStatus.OK,filmList);
    }

    @PostMapping("/costumer")
    public ResponseEntity<Object> save(@RequestBody Costumer film){
        costumerService.save(film);
        return ResponseHandler.generateResponse(SUCCESS_EDIT_MSG, HttpStatus.OK,film);
    }

    @PutMapping("/costumer")
    public ResponseEntity<Object> update(@RequestBody Costumer film ) {
        costumerService.update(film);
        return ResponseHandler.generateResponse(SUCCESS_EDIT_MSG, HttpStatus.OK, film);
    }
    @DeleteMapping("/costumer/{id}")
    public ResponseEntity<Object> delete(@PathVariable int id ) {
        costumerService.delete(id);
        return ResponseHandler.generateResponse(SUCCESS_EDIT_MSG, HttpStatus.OK, id);
    }
}
