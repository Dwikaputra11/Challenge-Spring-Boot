package com.binar.challenge_4.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

@Setter @Getter
@NoArgsConstructor
@Table(name = "schedule", schema = "public")
@Entity
@AllArgsConstructor
@ToString
public class Schedule {

    @Id
    @SequenceGenerator(
            name = "schedule_sequence",
            sequenceName = "schedule_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "schedule_sequence")
    @Column(name = "schedule_id")
    private int scheduleId;
    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    @Column(name = "due_date")
    private String dueDate;
    @Column(name = "price")
    private int price;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "schedule_studio_id")
    private Studio studio;

}
