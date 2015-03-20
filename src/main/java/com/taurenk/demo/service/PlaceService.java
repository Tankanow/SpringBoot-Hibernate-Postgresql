package com.taurenk.demo.service;

import com.taurenk.demo.model.Place;
import com.taurenk.demo.model.Test;
import com.taurenk.demo.repository.PlaceRepository;
import com.taurenk.demo.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tauren on 3/20/15.
 */
@Service
public class PlaceService {

    @Autowired
    private PlaceRepository placeRepo;

    /*public Place getPlace(Long id) {
        return placeRepo.findOne(id);
    }*/

   public Place getPlace(Integer id){
       return placeRepo.findOne(id);
   }

    public Place getPlaceByZip(String zip) { return placeRepo.findByZip(zip); }
}
