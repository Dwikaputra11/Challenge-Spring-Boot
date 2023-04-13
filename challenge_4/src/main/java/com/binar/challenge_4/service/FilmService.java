package com.binar.challenge_4.service;

import com.binar.challenge_4.models.Film;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface FilmService {

    Page<Film> findAll(Pageable pageable);

    Film findById(int id);

    Film save(Film film);

    Film update(Film updatedFilm);

    void delete(int id);

}
