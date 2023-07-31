package com.TrainDetails.EUIT003.Service;


import com.TrainDetails.EUIT003.Model.TrainDetails;

import java.util.List;
import java.util.Optional;

public interface TrainDetailsServiceInterface {

     TrainDetails PostDetails(TrainDetails trainDetails);
     List<TrainDetails> GetDetails();
     void DeleteDetails(int trainId);
     Optional<TrainDetails> GetDetailsById(int trainId);

}
