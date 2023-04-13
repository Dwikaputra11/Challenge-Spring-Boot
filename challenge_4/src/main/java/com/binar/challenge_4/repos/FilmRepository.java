package com.binar.challenge_4.repos;

import com.binar.challenge_4.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {
}
