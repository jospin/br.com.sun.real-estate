package br.com.sun.real.estate.model;

import javax.persistence.*;

/**
 * Created by lucienj on 13/03/2019.
 */
@Entity
public class Localization {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    @JoinColumn
    private Country country;
    @ManyToOne(optional=false)
    @JoinColumn
    private State state;
    @ManyToOne(optional=false)
    @JoinColumn
    private City city;
    @ManyToOne(optional=true)
    @JoinColumn
    private Zone zone;
    @ManyToOne(optional=true)
    @JoinColumn
    private District district;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
}
