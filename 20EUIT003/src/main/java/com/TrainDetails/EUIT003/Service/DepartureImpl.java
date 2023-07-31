package com.TrainDetails.EUIT003.Service;

import com.TrainDetails.EUIT003.Model.Departure;
import com.TrainDetails.EUIT003.Repository.DepartureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartureImpl implements  DepartureInterface{

    @Autowired
    DepartureRepository departureRepository;
    @Override
    public Departure PostDepartureDetails(Departure departure) {
        return departureRepository.save(departure);
    }

    @Override
    public List<Departure> GetDepartureDetails() {
        return departureRepository.findAll();
    }
}
