package com.binar.challenge_4.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter @Getter
@NoArgsConstructor
public class Studio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studioId;

    @Column(name = "name")
    private String name;
}
