package com.binar.challenge_4.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@Table(name = "payment", schema = "public")
@Entity
@AllArgsConstructor
@ToString
public class Payment {

    @Id
    @SequenceGenerator(
            name = "payment_sequence",
            sequenceName = "payment_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "payment_sequence")
    @Column(name = "payment_id")
    private int paymentId;

    @Column(name = "costumer_id")
    private int costumerId;

    @Column(name = "staff_id")
    private int staffId;

    @Column(name = "schedule_id")
    private int scheduleId;

    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    @Column(name = "payment_date")
    private String paymentDate;

    @Column(name = "amount")
    private int amount;


}
