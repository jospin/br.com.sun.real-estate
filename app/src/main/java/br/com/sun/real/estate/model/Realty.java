package br.com.sun.real.estate.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by lucienj on 13/03/2019.
 */
@Entity
public class Realty {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String title;
    @ManyToOne
    @JoinColumn
    private Localization localization;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn
    private Set<CommercialClassification> commercialClassifications;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn
    private Set<RealtyTypeClassification> realtyTypeClassifications;


}
