package br.com.sun.real.estate.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by lucienj on 13/03/2019.
 */
@Entity
public class State {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private Boolean active;
    private String name;
    @Size(min = 2, max = 2, message = "UF need to have only 2 characters")
    private String uf;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
