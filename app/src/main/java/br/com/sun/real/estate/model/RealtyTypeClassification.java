package br.com.sun.real.estate.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by lucienj on 15/03/2019.
 */
@Entity
public class RealtyTypeClassification {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;
    private Boolean active;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn
    private Set<Realty> realtys;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn
    private Set<RealTypeFeature> realTypeFeatures;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Set<Realty> getRealtys() {
        return realtys;
    }

    public void setRealtys(Set<Realty> realtys) {
        this.realtys = realtys;
    }

    public Set<RealTypeFeature> getRealTypeFeatures() {
        return realTypeFeatures;
    }

    public void setRealTypeFeatures(Set<RealTypeFeature> realTypeFeatures) {
        this.realTypeFeatures = realTypeFeatures;
    }
}
