package com.binar.challenge_4.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter @Getter
@NoArgsConstructor
@Table(name="staff", schema = "public")
public class Staff {

    @Id
    @SequenceGenerator(
            name = "staff_staff_id_seq",
            sequenceName = "staff_staff_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "staff_staff_id_seq",
            strategy = GenerationType.SEQUENCE)
    private int staffId;

    @Column(name = "name")
    private String name;

    @Column(name = "contact")
    private String contact;

    @Column(name = "last_update")
    private String lastUpdate;
}
