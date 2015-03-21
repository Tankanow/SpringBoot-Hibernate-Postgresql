package com.taurenk.demo.controller;

import com.taurenk.demo.model.AddrFeat;
import com.taurenk.demo.model.Place;
import com.taurenk.demo.repository.AddrFeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tauren on 3/21/15.
 */
@RestController
@RequestMapping("/api/addrfeats")
public class AddrFeatController {

    @Autowired
    private AddrFeatRepository addrFeatRepo;

    @RequestMapping("/getFeat")
    public AddrFeat featByGid(@RequestParam(value="gid", defaultValue="811259") Integer gid) {
        AddrFeat addrFeat = addrFeatRepo.findOne(gid);
        return  addrFeat;
    }

    @RequestMapping("/featByName")
    public AddrFeat featByName(@RequestParam(value="name", defaultValue="CAPUTO DR") String streetName) {
        AddrFeat addrFeat = addrFeatRepo.findByFullname(streetName);
        return  addrFeat;
    }

}
