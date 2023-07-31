package com.TrainDetails.EUIT003.Controller;

import com.TrainDetails.EUIT003.Model.Departure;
import com.TrainDetails.EUIT003.Service.DepartureImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartureController {

    @Autowired
    DepartureImpl departureimpl;

    @PostMapping("/CreateDeparture")
    public Departure PostDeparture(@RequestBody Departure departure){
        return departureimpl.PostDepartureDetails(departure);
    }
    @GetMapping("/DisplayDeparture")
    public List<Departure> DisplayDetails(){
        return departureimpl.GetDepartureDetails();
    }
}
