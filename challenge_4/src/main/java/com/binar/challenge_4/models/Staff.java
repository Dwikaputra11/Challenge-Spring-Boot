package com.binar.challenge_4.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter @Getter
@NoArgsConstructor
public class Staff {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int staffId;

    @Column(name = "name")
    private String name;

}
