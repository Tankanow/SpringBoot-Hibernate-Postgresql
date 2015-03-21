package com.taurenk.demo.controller;

import com.taurenk.demo.model.AddrFeat;
import com.taurenk.demo.model.Place;
import com.taurenk.demo.repository.AddrFeatRepository;
import com.taurenk.demo.service.AddrFeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by tauren on 3/21/15.
 */
@RestController
@RequestMapping("/api/addrfeats")
public class AddrFeatController {

    @Autowired
    private AddrFeatService addrFeatService;

    @RequestMapping("/getFeat")
    public AddrFeat featByGid(@RequestParam(value="gid", defaultValue="811259") Integer gid) {
        System.out.println("GETTING FEAT");
        AddrFeat addrFeat = addrFeatService.getAddrFeat(gid);
        System.out.println("Addr GEOM:" );
        System.out.println(addrFeat.getGeom());
        return  addrFeat;
    }

    @RequestMapping("/featByName")
    public List<AddrFeat> featByName(@RequestParam(value="name", defaultValue="CAPUTO DR") String streetName) {
        List<AddrFeat> featList = addrFeatService.featByName(streetName);

        return  featList;
    }

}
