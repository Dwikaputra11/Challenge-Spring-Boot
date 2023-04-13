package com.binar.challenge_4.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.List;

@Entity
@Setter @Getter
@NoArgsConstructor
@ToString
@Table(name = "film",schema = "public")
public class Film {

    @Id
    @SequenceGenerator(
            name = "film_film_id_seq",
            sequenceName = "film_film_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "film_film_id_seq",
            strategy = GenerationType.AUTO)
    private int filmId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    @Column(name = "release_date")
    private Date releaseDate;

    @Column(name = "actors")
    private List<String> actors;

    @Column(name = "score_rating")
    private double scoreRating;

    public Film(String title, String description, Date releaseDate, List<String> actors, double scoreRating) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.actors = actors;
        this.scoreRating = scoreRating;
    }
}
