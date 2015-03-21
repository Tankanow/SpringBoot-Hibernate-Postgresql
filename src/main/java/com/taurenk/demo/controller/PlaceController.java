package com.taurenk.demo.controller;

import com.taurenk.demo.model.Place;
import com.taurenk.demo.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tauren on 3/20/15.
 */
@RestController
@RequestMapping("/api/places")
public class PlaceController {

    @Autowired
    private PlaceService placeService;

    @RequestMapping("/get-one")
    public String getTest() {
        System.out.println("Testing...");
        Place place = placeService.getPlace(1);
        System.out.println(place);
        return  "Test Complete.";
    }

    @RequestMapping("/getPlaceByZip")
    public Place getPlaceByZipcode(@RequestParam(value="zipcode", defaultValue="11949") String zipcode) {
        Place place = placeService.getPlaceByZip(zipcode);
        return  place;
    }



}
