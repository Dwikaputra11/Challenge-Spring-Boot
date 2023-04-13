package com.binar.challenge_4.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter @Getter
@NoArgsConstructor
@Table(name="costumer", schema = "public")
public class Costumer {

    @Id
    @SequenceGenerator(
            name = "costumer_costumer_id_seq",
            sequenceName = "costumer_costumer_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "costumer_costumer_id_seq",
            strategy = GenerationType.AUTO)
    private int costumerId;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "last_update")
    private String lastUpdate;
}
