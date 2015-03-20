package com.taurenk.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * Created by tauren on 3/20/15.
 */
@Entity
@Table(name="place")
public class Place {

    @Id
    private Integer Id;

    private String zip;

    // County
    private String place;

    // State
    private String name1;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String toString(){
        String string = getPlace() +  ", " + getName1() + " " + getZip();
        return string;
    }
}
