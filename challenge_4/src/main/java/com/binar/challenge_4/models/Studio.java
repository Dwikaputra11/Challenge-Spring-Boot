package com.binar.challenge_4.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter @Getter
@NoArgsConstructor
@Table(name = "studio", schema = "public")
public class Studio {
    @Id
    @SequenceGenerator(
            name = "studio_studio_id_seq",
            sequenceName = "studio_studio_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "studio_studio_id_seq",
            strategy = GenerationType.SEQUENCE)
    private int studioId;

    @Column(name = "name")
    private String name;

    @Column(name = "last_update")
    private String lastUpdate;
}
