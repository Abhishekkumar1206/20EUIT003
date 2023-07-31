package com.TrainDetails.EUIT003.Service;

import com.TrainDetails.EUIT003.Model.Departure;

import java.util.List;

public interface DepartureInterface {

    Departure PostDepartureDetails(Departure departure);

    List<Departure> GetDepartureDetails();
}
