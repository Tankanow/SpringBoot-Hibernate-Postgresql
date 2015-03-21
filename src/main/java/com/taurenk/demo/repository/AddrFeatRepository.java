package com.taurenk.demo.repository;

import com.taurenk.demo.model.AddrFeat;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by tauren on 3/21/15.
 */
public interface AddrFeatRepository extends CrudRepository<AddrFeat, Integer> {

    List<AddrFeat> findByFullname(String fullname);

}
