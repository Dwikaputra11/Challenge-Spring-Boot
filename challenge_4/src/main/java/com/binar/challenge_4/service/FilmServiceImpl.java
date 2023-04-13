package com.binar.challenge_4.service;

import com.binar.challenge_4.models.Film;
import com.binar.challenge_4.repos.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FilmServiceImpl implements FilmService {

    private final FilmRepository filmRepository;
    @Autowired
    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }
    @Override
    public Page<Film> findAll(Pageable pageable) {
        return filmRepository.findAll(pageable);
    }

    @Override
    public Optional<Film> findById(int id) {
        return filmRepository.findById(id);
    }

    @Override
    public Film save(Film film) {
        if (film.getTitle() != null && !film.getTitle().isEmpty()
                && film.getDescription() != null && !film.getDescription().isEmpty()
                && film.getReleaseDate() != null &&!film.getReleaseDate().isEmpty()
                && film.getActors() != null
                && film.getScoreRating() != null && film.getScoreRating().isEmpty()
        ) {
            return filmRepository.save(film);
        } else {
            throw new RuntimeException("Data film tidak lengkap");
        }
    }

    @Override
    public Film update(Film updatedFilm) {
        Optional<Film> result = filmRepository.findById(updatedFilm.getFilmId());
        Film film;

        if (result.isPresent()) {
            film = result.get();
            film.setTitle(updatedFilm.getTitle());
            film.setDescription(updatedFilm.getDescription());
            film.setScoreRating(updatedFilm.getScoreRating());
            film.setReleaseDate(updatedFilm.getReleaseDate());
            film.setActors(updatedFilm.getActors());
            return filmRepository.save(film);
        } else {
            throw new RuntimeException("Data film tidak ditemukan");
        }
    }

    @Override
    public void delete(int id) {
        Optional<Film> result = filmRepository.findById(id);
        if (result.isPresent()) {
            filmRepository.delete(result.get());
        } else {
            throw new RuntimeException("Data film tidak ditemukan");
        }
    }
}
