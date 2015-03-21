package com.taurenk.demo.repository;

import com.taurenk.demo.model.AddrFeat;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by tauren on 3/21/15.
 */
public interface AddrFeatRepository extends CrudRepository<AddrFeat, Integer> {

    AddrFeat findByFullname(String fullname);

}
