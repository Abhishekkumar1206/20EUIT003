package com.TrainDetails.EUIT003.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(schema = "Details")
public class TrainDetails {

    @Id
   private int trainId;
    private String TrainName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_id")
   private Departure departure;


}
