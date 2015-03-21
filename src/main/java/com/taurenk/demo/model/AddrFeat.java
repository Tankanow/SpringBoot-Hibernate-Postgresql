package com.taurenk.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by tauren on 3/21/15.
 */
@Entity
@Table(name="addrfeat")
public class AddrFeat {

    @Id
    private Integer gid;

    private String fullname;

    private String lfromhn;

    private String ltohn;

    private String rfromhn;

    private String rtohn;

    private String zipl;

    private String zipr;

    private String geom;

    private String name;

    private String predirabrv;

    private String pretypabrv;

    private String suftypabrv;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getLfromhn() {
        return lfromhn;
    }

    public void setLfromhn(String lfromhn) {
        this.lfromhn = lfromhn;
    }

    public String getLtohn() {
        return ltohn;
    }

    public void setLtohn(String ltohn) {
        this.ltohn = ltohn;
    }

    public String getRfromhn() {
        return rfromhn;
    }

    public void setRfromhn(String rfromhn) {
        this.rfromhn = rfromhn;
    }

    public String getRtohn() {
        return rtohn;
    }

    public void setRtohn(String rtohn) {
        this.rtohn = rtohn;
    }

    public String getZipl() {
        return zipl;
    }

    public void setZipl(String zipl) {
        this.zipl = zipl;
    }

    public String getZipr() {
        return zipr;
    }

    public void setZipr(String zipr) {
        this.zipr = zipr;
    }

    public String getGeom() {
        return geom;
    }

    public void setGeom(String geom) {
        this.geom = geom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPredirabrv() {
        return predirabrv;
    }

    public void setPredirabrv(String predirabrv) {
        this.predirabrv = predirabrv;
    }

    public String getPretypabrv() {
        return pretypabrv;
    }

    public void setPretypabrv(String pretypabrv) {
        this.pretypabrv = pretypabrv;
    }

    public String getSuftypabrv() {
        return suftypabrv;
    }

    public void setSuftypabv(String suftypabrv) {
        this.suftypabrv = suftypabrv;
    }
}
