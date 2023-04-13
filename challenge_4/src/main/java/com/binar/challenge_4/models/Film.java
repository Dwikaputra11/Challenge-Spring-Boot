package com.binar.challenge_4.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Setter @Getter
@NoArgsConstructor
@ToString
public class Film {

    @Id
    @SequenceGenerator(
            name = "film_id_seq",
            sequenceName = "film_id_seq"
    )
    @GeneratedValue(
            generator = "film_id_seq",
            strategy = GenerationType.SEQUENCE)
    private int filmId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "release_date")
    private String releaseDate;

    @Column(name = "actors")
    private List<String> actors;

    @Column(name = "score_rating")
    private String scoreRating;

    public Film(String title, String description, String releaseDate, List<String> actors, String scoreRating) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.actors = actors;
        this.scoreRating = scoreRating;
    }
}
