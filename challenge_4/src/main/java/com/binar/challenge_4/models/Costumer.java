package com.binar.challenge_4.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter @Getter
@NoArgsConstructor
public class Costumer {

    @Id
    @SequenceGenerator(
            name = "costumer_id_seq",
            sequenceName = "film_id_seq"
    )
    @GeneratedValue(
            generator = "film_id_seq",
            strategy = GenerationType.SEQUENCE)
    private int costumerId;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    public Costumer(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
