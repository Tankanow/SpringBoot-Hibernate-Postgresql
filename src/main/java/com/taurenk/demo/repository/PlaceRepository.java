package com.taurenk.demo.repository;

import com.taurenk.demo.model.Place;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by tauren on 3/20/15.
 */
public interface  PlaceRepository extends CrudRepository<Place, Integer> {

    Place findByZip(String zip);
}
