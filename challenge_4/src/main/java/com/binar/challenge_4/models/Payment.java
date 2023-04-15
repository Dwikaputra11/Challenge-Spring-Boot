package com.binar.challenge_4.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@Table(name = "payment", schema = "public")
@Entity
@AllArgsConstructor
@ToString
public class Payment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id", nullable = false, unique = true)
    private int paymentId;

//    @Column(name = "costumer_id")
//    private int costumerId;
//
//    @Column(name = "staff_id")
//    private int staffId;
//
//    @Column(name = "schedule_id")
//    private int scheduleId;

    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    @Column(name = "payment_date")
    private Date paymentDate;

    @Column(name = "amount")
    private int amount;

    @OneToOne(targetEntity = Schedule.class, cascade = CascadeType.MERGE)
    @JoinColumn(name = "schedule_id", referencedColumnName = "schedule_id")
    private Schedule schedule;

    @OneToOne(targetEntity = Costumer.class, cascade = CascadeType.MERGE)
    @JoinColumn(name = "costumer_id", referencedColumnName = "costumer_id")
    private Costumer costumer;

    @OneToOne(targetEntity = Staff.class, cascade = CascadeType.MERGE)
    @JoinColumn(name = "staff_id", referencedColumnName = "staff_id")
    private Staff staff;

}
