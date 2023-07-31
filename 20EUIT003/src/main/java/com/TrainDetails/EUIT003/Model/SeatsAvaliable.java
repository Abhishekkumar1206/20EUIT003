package com.TrainDetails.EUIT003.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class SeatsAvaliable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int seatId;
    int sleeper;
    int Ac;
}
