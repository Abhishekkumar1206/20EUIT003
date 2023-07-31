package com.TrainDetails.EUIT003.Repository;

import com.TrainDetails.EUIT003.Model.TrainDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainDetailsRepository extends JpaRepository<TrainDetails,Integer> {
}
