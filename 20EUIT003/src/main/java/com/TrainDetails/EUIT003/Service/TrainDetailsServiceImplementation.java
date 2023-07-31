package com.TrainDetails.EUIT003.Service;

import com.TrainDetails.EUIT003.Model.TrainDetails;
import com.TrainDetails.EUIT003.Repository.TrainDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainDetailsServiceImplementation implements  TrainDetailsServiceInterface{

    @Autowired
    TrainDetailsRepository trainDetailsRepository;
    @Override
    public TrainDetails PostDetails(TrainDetails trainDetails) {

      return  trainDetailsRepository.save(trainDetails);
    }

    @Override
    public List<TrainDetails> GetDetails() {

        return (List<TrainDetails>)trainDetailsRepository.findAll();
    }

    @Override
    public void DeleteDetails(int trainId) {

        trainDetailsRepository.deleteById(trainId);

    }

    @Override
    public Optional<TrainDetails> GetDetailsById(int trainId) {
        return trainDetailsRepository.findById(trainId);
    }
}
