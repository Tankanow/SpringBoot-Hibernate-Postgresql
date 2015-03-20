package com.taurenk.demo.repository;


import com.taurenk.demo.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by tauren on 3/20/15.
 */
public interface TestRepository extends CrudRepository<Test, Integer> {

}
