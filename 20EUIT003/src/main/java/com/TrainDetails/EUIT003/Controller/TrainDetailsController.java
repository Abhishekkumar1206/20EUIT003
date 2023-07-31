package com.TrainDetails.EUIT003.Controller;

import com.TrainDetails.EUIT003.Model.TrainDetails;
import com.TrainDetails.EUIT003.Service.TrainDetailsServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping(value = "/trains")
public class TrainDetailsController {

    @Autowired
    TrainDetailsServiceImplementation trainDetailsServiceImplementation;

    @PostMapping("/PostTrainDetails")
    public TrainDetails CreateDetails(@RequestBody TrainDetails trainDetails){
        return trainDetailsServiceImplementation.PostDetails(trainDetails);
    }
    @GetMapping("/GetAllDetails")
    public List<TrainDetails> DisplayDetails(){
        return trainDetailsServiceImplementation.GetDetails();
    }
    @DeleteMapping("/Delete/{id}")
    void deleteDetails(@PathVariable("id") int trainId){
        trainDetailsServiceImplementation.DeleteDetails(trainId);
    }
    @GetMapping("/{id}")
    public Optional<TrainDetails> GetTrainById(@PathVariable("id") int trainId){
        return trainDetailsServiceImplementation.GetDetailsById(trainId);
    }
}
