package com.TrainDetails.EUIT003.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Departure {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private int deptid;

   private String Hours;
   private String Time;
    private String Seconds;
}

