package com.TrainDetails.EUIT003.Repository;

import com.TrainDetails.EUIT003.Model.Departure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartureRepository extends JpaRepository<Departure,Integer> {
}
