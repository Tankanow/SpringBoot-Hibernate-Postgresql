package com.taurenk.demo.service;

import com.taurenk.demo.model.AddrFeat;
import com.taurenk.demo.repository.AddrFeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tauren on 3/21/15.
 */
@Service
public class AddrFeatService {

    @Autowired
    private AddrFeatRepository addrFeatRepo;

    /**
     * Return AddrFeat based on gid
     * Not very usefull...
     * @param gid
     * @return
     */
    public AddrFeat getAddrFeat(Integer gid) {
        return addrFeatRepo.findOne(gid);
    }

    /**
     *
     * @param fullname
     * @return
     */
    public List<AddrFeat> featByName(String fullname) {
        return addrFeatRepo.findByFullname(fullname);
    }


}